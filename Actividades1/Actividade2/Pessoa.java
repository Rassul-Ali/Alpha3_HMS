public class Pessoa {

    static int inc = 0;
    int valor, ID;
    Pessoa Proximo;

    public Pessoa(int valor) {
        this.valor = valor;
        this.ID = ++inc;
        this.Proximo = this;
    }
}
