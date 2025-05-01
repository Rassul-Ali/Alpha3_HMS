
public class NodoCircular {

    int valor, ID;
    static int inc = 0;
    NodoCircular proximo;

    public NodoCircular(int valor) {
        this.valor = valor;
        this.proximo = this;
        this.ID = ++inc;
    }
}