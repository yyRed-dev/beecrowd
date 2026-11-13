import java.util.*;
import java.io.IOException;

public class Main {
    static Scanner sc;
    public static void main (String [] args) throws IOException {
        sc = new Scanner(System.in);
    
        double R = sc.nextDouble();
        System.out.printf("VOLUME = %.3f%n", (4*3.14159*R*R*R)/3 );
    }
}