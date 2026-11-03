import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) throws IOException {
 
        sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n%2 == 0) {
            System.out.println(n+1);
        } else {
            System.out.println(n+2);
        }
 
    }
 
}