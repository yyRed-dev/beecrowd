import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int testes = sc.nextInt();
        for (int i=0; i<testes; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println( mdc(a,b) );
        }
        sc.close();
    }

    static int mdc(int  a, int b) {
        if (b == 0) {
            return a;
        }

        return mdc(b, a%b);
    }
 
}