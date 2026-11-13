import java.util.*;
import java.io.IOException;

public class Main {
    static Scanner sc;
    public static void main (String[] args) throws IOException {

        sc = new Scanner(System.in);

        String nome = sc.nextLine();
        float sal = sc.nextFloat();
        float vendas = sc.nextFloat();

        System.out.printf("TOTAL = R$ %.2f%n", sal+(vendas*0.15) );
    }
}