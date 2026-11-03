import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main (String[] args) throws IOException{

        sc = new Scanner(System.in);
        int N;

        while (true) {
            N = sc.nextInt();

            if (N == 0) {
                break;
            }    
            while (true) {
                int vagoes[] = new int[N];

                int primeiro = sc.nextInt();
                if (primeiro == 0) {
                    System.out.println("");
                    break;
                }
                    
                vagoes[0] = primeiro;
                for (int i=1; i<N; i++) {
                    vagoes[i] = sc.nextInt();
                }

                if ( possivel(vagoes, N) ) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }

            }
            
        }
    }

    static boolean possivel (int[] vagoes, int N) {
        PilhaD estacao = new PilhaD();
        int proximo = 1;

        for (int i=0; i<N; i++) {
            int alvo = vagoes[i];

            while (proximo <= alvo) {
                estacao.push(proximo);
                proximo++;
            }

            if ( alvo == estacao.last() ) {
                estacao.pop();
            } else {
                return false;
            }
        }
        return true;
    }
}