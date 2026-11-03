import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();
        while (casos < 1 || casos > 30) {
            casos = sc.nextInt();
        }
        int i;
        for (i=0; i<casos; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int resultado = josephus(n, k)+1;
            System.out.println("Case " +(i+1)+ ": " +resultado);
        }
        sc.close();
    }

    static int josephus(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (josephus(n-1,k)+k) % n;
    }
}