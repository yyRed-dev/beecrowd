import java.util.*;
import java.io.IOException;

public class Main {
    static Scanner sc;
    public static void main (String [] args) throws IOException {
        sc = new Scanner(System.in);
    
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double media = (nota1*3.5 + nota2*7.5)/11;

        System.out.printf("MEDIA = %.5f%n",media);
    }
}