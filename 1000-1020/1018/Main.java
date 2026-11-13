import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main (String[] args) throws IOException {
        sc = new Scanner(System.in);

        int desejado = sc.nextInt();
        int saque = desejado;
        int nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0, nota1 = 0;

        while (saque >= 100) {
            nota100++;
            saque -= 100;
        }

        while (saque >= 50) {
            nota50++;
            saque -= 50;
        }

        while (saque >= 20) {
            nota20++;
            saque -= 20;
        }

        while (saque >= 10) {
            nota10++;
            saque -= 10;
        }

        while (saque >= 5) {
            nota5++;
            saque -= 5;
        }

        while (saque >= 2) {
            nota2++;
            saque -= 2;
        }

        while (saque >= 1) {
            nota1++;
            saque -= 1;
        }

        System.out.println(desejado);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");

    }
}