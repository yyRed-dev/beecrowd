import java.util.*;
import java.io.IOException;

public class Main {
    static Scanner sc;
    public static void main (String[] args) throws IOException {

        sc = new Scanner(System.in);

        int num = sc.nextInt();
        int horas = sc.nextInt();
        float valor = sc.nextFloat();

        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f%n", valor*horas);
    }
}