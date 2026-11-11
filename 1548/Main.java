import java.io.IOException;
import java.util.*;

public class Main {
    static Scanner sc;
    public static void main (String[] args) throws IOException{
        sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            int m = sc.nextInt();

            Fila fila = new Fila();
            int[] vetor = new int[m];

            for (int j=0; j<m; j++) {
                int nota = sc.nextInt();
                vetor[j] = nota;
                fila.enqueue(nota);
            }

            int iguais = 0;
            for (int k=0; k<m; k++) {
                if (vetor[k] == fila.dequeue() ) {
                    iguais++;
                }
            }
            System.out.println(iguais);

        }

    }
}