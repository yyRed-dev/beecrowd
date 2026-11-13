import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main (String[] args) throws IOException {
        sc = new Scanner(System.in);

        int horas = sc.nextInt();
        int vel = sc.nextInt();

        double dist = vel * horas;
        System.out.printf("%.3f%n",dist/12);
    }
}