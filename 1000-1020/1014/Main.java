import java.util.*;
import java.io.IOException;

public class Main {
    static Scanner sc;
    public static void main (String [] args) throws IOException {
        sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        float Y = sc.nextFloat();

        System.out.printf("%.3f km/l%n",X/Y);
    }
}