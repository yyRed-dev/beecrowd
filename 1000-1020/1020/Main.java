import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main (String[] args) throws IOException {
        sc = new Scanner(System.in);

        int tempo = sc.nextInt();
        int ano = 0, mes = 0, dia = 0;

        while (tempo >= 365) {
            ano++;
            tempo -= 365;
        }

        while (tempo >= 30) {
            mes++;
            tempo -= 30;
        }

        while (tempo >= 1) {
            dia++;
            tempo -= 1;
        }

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");
    }
}