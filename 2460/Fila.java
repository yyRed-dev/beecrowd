public class Fila {
    
    Node primeiro;
    Node ultimo;
    int cont;

    public void enqueue(int valor) {
        Node novo = new Node(valor);
        if ( empty() ) {
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.prox = novo;
            novo.ant = ultimo;
            ultimo = novo;
        }
        cont++;
    }

    public void dequeue() {
        if ( empty() ) {
            System.out.println("Fila vazia");
            return;
        }

        if (cont == 1) {
            clear();
            return;
        }

        primeiro = primeiro.prox;
        primeiro.ant = null;
        cont--;
    }

    public void dequeue(int valor) {
        if ( empty() ) {
            System.out.println("Fila vazia");
            return;
        } else if (cont == 1) {
            clear();
            return;
        }
        
        Node atual = primeiro;
        while (atual.valor != valor) {
            atual = atual.prox;
        }

        if () {

        }


    }   

    public int peek() {
        return primeiro.valor;
    }

    public boolean empty() {
        return (cont == 0);
    }

    public void clear() {
        primeiro = null;
        ultimo = null;
        cont = 0;
    }

    @Override
    public String toString() {
        String resultado = "[";
        Node atual = primeiro;

        while (atual != null) {
            resultado += atual.valor + " ";
            atual = atual.prox;
        }
        resultado += "]";
        return resultado;

    }

}