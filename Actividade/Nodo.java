public class Nodo {
    int valor;
    Nodo proximo;
    
    Nodo(int valor) {
        this.valor = valor;
        this.proximo = this;
    }
}
