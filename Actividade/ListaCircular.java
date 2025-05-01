public class ListaCircular {
    protected Nodo atual;
    
    public void inserir(int valor) {
        Nodo novo = new Nodo(valor);
        
        if (atual == null) {
            atual = novo;
        } else {
            novo.proximo = atual.proximo;
            atual.proximo = novo;
            atual = novo;
        }
    }
    
    public boolean procurar(int valor) {
        if (atual == null) return false;
        
        Nodo temp = atual;
        do {
            if (temp.valor == valor) {
                return true;
            }
            temp = temp.proximo;
        } while (temp != atual);
        
        return false;
    }
    
    public boolean remover(int valor) {
        if (atual == null) return false;
        
        Nodo anterior = atual;
        Nodo temp = atual.proximo;
        
        do {
            if (temp.valor == valor) {
                anterior.proximo = temp.proximo;
                if (temp == atual) {
                    if (anterior == atual) {
                        atual = null;
                    } else {
                        atual = anterior;
                    }
                }
                return true;
            }
            anterior = temp;
            temp = temp.proximo;
        } while (temp != atual.proximo);
        
        return false;
    }
    
    public void imprimir() {
        if (atual == null) {
            System.out.println("Lista vazia");
            return;
        }
        
        Nodo temp = atual;
        do {
            System.out.print(temp.valor + " ");
            temp = temp.proximo;
        } while (temp != atual);
        System.out.println();
    }
}