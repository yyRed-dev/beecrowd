public class Fila {
 
    Node primeiro = null;
    Node ultimo = null;
    int contador;

    public void enqueue(int valor) {
        Node novo = new Node(valor);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.prox = novo;
            novo.ant = ultimo;
            ultimo = novo;
        }
        contador++;
    }

    public int dequeue() {
        
        if ( empty() ) {
            System.out.println("Fila vazia");
            return 0;
        }

        if (size() == 1) {
            int maior = primeiro.valor;
            clear();
            return maior;
        }

        Node atual = primeiro;
        Node maior = atual;

        while (atual != null) {
            if (atual.valor > maior.valor) {
                maior = atual;
            }
            atual = atual.prox;
        }

        if (maior == primeiro) {
            primeiro = primeiro.prox;
            primeiro.ant = null;
        } else if (maior == ultimo) {
            ultimo = ultimo.ant;
            ultimo.prox = null;
        } else {
            maior.prox.ant = maior.ant;
            maior.ant.prox = maior.prox;
        }
        contador--;
        return maior.valor;
    }

    public int peek() {
        return primeiro.valor;
    }

    public void clear() {
        ultimo = null;
        primeiro = null;
        contador = 0;
    }

    public boolean empty() {
        return (primeiro == null);
    }

    public int size() {
        return contador;
    }

    @Override
    public String toString() {
        Node atual = primeiro;
        String resultado = "[ ";
        
        while (atual != null) {
            resultado += atual.valor + " ";
            atual = atual.prox;
        }
        resultado += "]";
        return resultado;
    }

}