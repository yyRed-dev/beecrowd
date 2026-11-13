import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main (String[] args) throws IOException {
        sc = new Scanner(System.in);

        int tempo = sc.nextInt();
        int hora = 0, minuto = 0, segundo = 0;

        while (tempo >= 3600) {
            hora++;
            tempo -= 3600;
        }

        while (tempo >= 60) {
            minuto++;
            tempo -= 60;
        }

        while (tempo >= 1) {
            segundo++;
            tempo -= 1;
        }
        
        System.out.println(hora+":"+minuto+":"+segundo);
    }
}