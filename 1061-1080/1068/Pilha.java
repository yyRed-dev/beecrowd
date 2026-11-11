public class Pilha {
 
    Node topo;
    int cont;

    public void push(char valor) {
        Node novo = new Node(valor);
        if (topo == null) {
            topo = novo;
        } else {
            novo.ant = topo;
            topo = novo;
        }
        cont++;
    }

    public void pop() {
        if ( empty() ) {
            System.out.println("Pilha vazia");
            return;
        }

        topo = topo.ant;
        cont--;
    }

    public char peek() {
        return topo.valor;
    }

    public boolean empty() {
        return (topo == null);
    }

    @Override
    public String toString() {
        if ( empty() ) {
            return "Pilha vazia";
        }

        Node atual = topo;
        String resultado = "[ ";
        
        while (atual != null) {
            resultado += atual.valor + " ";
            atual = atual.ant;
        }
        resultado += "]";
        return resultado;
    }

}