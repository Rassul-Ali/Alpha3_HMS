public class Nodo {
    static int inc = 0;
    int valor, ID;
    Nodo proximo;

    public Nodo(int valor){
        this.valor = valor;
        this.ID = ++inc;
        this.proximo = null;
    }
}
