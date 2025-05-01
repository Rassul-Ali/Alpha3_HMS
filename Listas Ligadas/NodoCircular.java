public class NodoCircular {
    static int inc = 0; // variavel estatica para incrementar o id
    int id;
    int valor;
    NodoCircular proximo;
    
    public NodoCircular(int valor1){
        valor = valor1;
        proximo = null;
        id = ++inc; //incremebto do id sempre que e instanciada uma nova variavel NodoCircular
    }
}
