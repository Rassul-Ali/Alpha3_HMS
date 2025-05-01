public class Nodo{
    static int inc = 1;
    int id;
    int valor;
    Nodo proximo;

    public Nodo(int valor1){
        valor = valor1;
        proximo = null;
        id = ++inc;
    }
}