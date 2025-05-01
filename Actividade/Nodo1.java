public class Nodo1{
    private static int inc = 0;
    int id;
    int valor;
    Nodo1 proximo;

    public Nodo1(int valor1){
        valor = valor1;
        proximo = null;
        id = ++inc;
    }
}