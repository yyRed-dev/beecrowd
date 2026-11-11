import java.io.IOException;
import java.util.*;

public class Main {
    static Scanner sc;
    public static void main (String[] args) throws IOException {
        sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            Pilha pilha = new Pilha();
            boolean valido = true;

            for (int i=0; i<linha.length(); i++) {
                char c = linha.charAt(i);
                if (c == '(') {
                    pilha.push(c);
                } else if (c == ')') {
                    if ( pilha.empty() ) {
                        valido = false;
                        break;
                    }
                    pilha.pop();
                }
            }

            if ( valido && pilha.empty() ) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        
        }

    }
}