public class Lista {
    Nodo inicio;
    
    public class Nodo {
        char valor;
        Nodo proximo;
        
        Nodo(char valor) {
            this.valor = valor;
        }
    }
    
    public void inserir(char valor) {
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
    
    public void imprimir() {
        Nodo atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}
