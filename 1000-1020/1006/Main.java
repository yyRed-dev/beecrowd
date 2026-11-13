import java.util.*;
import java.io.IOException;

public class Main {
    static Scanner sc;
    public static void main (String[] args) throws IOException {

        sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double media = ((A*2)+(B*3)+(C*5))/10;
        System.out.printf("MEDIA = %.1f%n",media);
    }
}