import java.util.Scanner;

public class Main {
    static int cont;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int valor = sc.nextInt();
            while (valor < 1 || valor >39) {
                valor = sc.nextInt();
            }
            cont = 0;
            int resultado = fib(valor);
            System.out.println(
                "fib(" + valor + ") = " + (cont - 1) + " calls = " + resultado
            );
        }
        sc.close();
    }

    static int fib(int a) {
        cont++;
        if (a <= 1) {
            return a;
        }
        return fib(a - 1) + fib(a - 2);
    }
}