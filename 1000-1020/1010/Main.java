import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main (String[] args) throws IOException {
        sc = new Scanner(System.in);

        double total = 0;
        for (int i=0; i<2; i++) {
            int id = sc.nextInt();
            int quantidade = sc.nextInt();
            double valor = sc.nextDouble();

            total += quantidade*valor;

        }
        System.out.print("VALOR A PAGAR: R$ ");
        System.out.printf("%.2f%n",total);
    }
}