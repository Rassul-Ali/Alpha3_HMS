public class NodoDuplo {
    static int inc = 0;
    int id;
    int valor;
    NodoDuplo proximo;
    NodoDuplo anterior;
    
    public NodoDuplo(int valor1){
        valor = valor1;
        proximo = null;
        anterior = null;
        id = ++inc;
    }
    
}
