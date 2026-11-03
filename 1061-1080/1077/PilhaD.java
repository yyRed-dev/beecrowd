public class PilhaD {

    Node topo = null;
    int cont = 0;

    public void push(String nome) {
        Node novo = new Node(nome);

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
            return true;
        }
        return false;
    }

    public String last() {
        return topo.nome;
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
            resultado += atual.nome + " ";
            atual = atual.anterior;
        }
        resultado += "]";
        return resultado;
    }

}