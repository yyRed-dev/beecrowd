import java.util.*;
import java.io.IOException;

public class Main {
    static Scanner sc;
    public static void main (String[] args) throws IOException {

        sc = new Scanner(System.in);

        int distancia = sc.nextInt();
        System.out.println(distancia*2 + " minutos");
    }
}