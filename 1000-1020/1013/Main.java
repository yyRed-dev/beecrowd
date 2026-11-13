import java.util.*;
import java.io.IOException;

public class Main {
    static Scanner sc;
    public static void main (String [] args) throws IOException {
        sc = new Scanner(System.in);
        
        int[] vetor = new int[3];
        int maior = -1000000000;

        for (int i=0; i<3; i++) {
            vetor[i] = sc.nextInt();
            
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        System.out.println(maior + " eh o maior");

    }
}