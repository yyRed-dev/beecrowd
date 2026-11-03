import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) throws IOException {
        sc = new Scanner(System.in);

        Ponto p1 = new Ponto(sc.nextFloat(), sc.nextFloat());
        Ponto p2 = new Ponto(sc.nextFloat(), sc.nextFloat());

        p1.distancia(p2);
    }
 
}