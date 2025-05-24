public class ListaLigada {
    private No cabeca;
    
    public ListaLigada() {
        cabeca = null;
    }
    
    public void adicionar(int valor) {
        No novoNo = new No(valor);
        if (cabeca == null) {
            cabeca = novoNo;
        } else {
            No atual = cabeca;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }
    
    public boolean contem(int valor) {
        No atual = cabeca;
        while (atual != null) {
            if (atual.valor == valor) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }
    
    public No getCabeca() {
        return cabeca;
    }
}