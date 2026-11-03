import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) throws IOException {
 
        sc = new Scanner(System.in);

        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();

        System.out.print("TRIANGULO: ");
        System.out.printf("%.3f%n",(A*C)/2);

        System.out.print("CIRCULO: ");
        System.out.printf("%.3f%n",3.14159*C*C);

        System.out.print("TRAPEZIO: ");
        System.out.printf("%.3f%n",((A+B)*C)/2);

        System.out.print("QUADRADO: ");
        System.out.printf("%.3f%n",B*B);

        System.out.print("RETANGULO: ");
        System.out.printf("%.3f%n",A*B);

    }
 
}