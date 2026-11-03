import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main (String[] args) throws IOException{

        sc = new Scanner(System.in);

        PilhaD simbolos = new PilhaD();
        PilhaD valores = new PilhaD();

        String equacao = sc.nextLine();
        
        for (int i=0; i<equacao.length(); i++) {
            char aux = equacao.charAt(i);

            if ( Character.isLetterOrDigit(aux) ) {
                valores.push(aux);
            } else {
                simbolos.push(aux);
            }
        }
        int soma = valores.size() + simbolos.size();
        System.out.println(soma);

        System.out.println(valores);
        System.out.println(simbolos);

        char resultado;

        


    }
}