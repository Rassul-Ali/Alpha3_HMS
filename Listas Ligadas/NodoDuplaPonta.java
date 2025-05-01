public class NodoDuplaPonta {
    static int inc = 0;
    int id;
    int valor;
    NodoDuplaPonta proximo;
    NodoDuplaPonta ultimo;
    
    public NodoDuplaPonta(int valor1){
        valor = valor1;
        proximo = null;
        ultimo =  null;
        id = ++inc;
    }
}
