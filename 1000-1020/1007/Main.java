import java.util.*;
import java.io.IOException;

public class Main {
    static Scanner sc;
    public static void main (String[] args) throws IOException {

        sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int dif = (A*B)-(C*D);
        System.out.println("DIFERENCA = " + dif);

    }
}