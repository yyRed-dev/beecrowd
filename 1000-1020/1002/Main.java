import java.util.*;
import java.io.IOException;

public class Main {
    static Scanner sc;
    public static void main (String [] args) throws IOException {
        sc = new Scanner(System.in);
    
        Circulo c1 = new Circulo(sc.nextDouble());
        System.out.printf("A=%.4f%n",c1.area());

    }
}