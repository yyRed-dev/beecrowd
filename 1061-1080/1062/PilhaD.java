public class PilhaD {

    Node topo = null;
    int cont = 0;

    public void push(int valor) {
        Node novo = new Node(valor);

        if (topo == null) {
            topo = novo;
        } else {
            novo.anterior = topo;
            topo = novo;
        }
        cont++;
    }

    public void pop() {
        if (cont == 0) {
            return;
        }

        if (cont == 1) {
            topo = null;
            cont--;
            return;
        }

        topo = topo.anterior;
        cont--;
    }

    public boolean empty() {
        if (topo != null) {
            return false;
        }
        return true;
    }

    public int last() {
        return topo.valor;
    }

    public int size() {
        return cont;
    }

    public void destruct() {
        topo = null;
        cont = 0;
    }

    @Override
    public String toString() {
        String resultado = "[ ";
        Node atual = topo;
        while(atual != null) {
            resultado += atual.valor + " ";
            atual = atual.anterior;
        }
        resultado += "]";
        return resultado;
    }

}