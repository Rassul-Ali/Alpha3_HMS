
public class FilasPropriedade {

    private ListaSimplismenteLigada lista = new ListaSimplismenteLigada();

    public int size() {

        return lista.tamanho();
    }

    public boolean isEmpty() {
        return lista.primeiro == null;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Fila vazia");
        }
        return lista.retornarPrimeiro().valor;
    }

    public void insert(int valor) {
        lista.inserirUltimo(valor);
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Fila vazia");
        }
        return lista.removerPrimeiro();
    }
}
