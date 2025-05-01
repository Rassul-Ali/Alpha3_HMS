public class ListaSimples {
    private class Nodo {
        int valor;
        Nodo proximo;
        
        Nodo(int valor) {
            this.valor = valor;
        }
    }
    
    private Nodo inicio;
    
    public void inserir(int valor) {
        Nodo novo = new Nodo(valor);
        if (inicio == null) {
            inicio = novo;
        } else {
            Nodo atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
    }
    
    public void removerMaioresQue(int valor) {
        
        while (inicio != null && inicio.valor > valor) {
            inicio = inicio.proximo;
        }
        
        if (inicio == null) return;
        
        Nodo anterior = inicio;
        Nodo atual = inicio.proximo;
        
        while (atual != null) {
            if (atual.valor > valor) {
                anterior.proximo = atual.proximo;
                atual = anterior.proximo;
            } else {
                anterior = atual;
                atual = atual.proximo;
            }
        }
    }
    
    public void imprimir() {
        Nodo atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}