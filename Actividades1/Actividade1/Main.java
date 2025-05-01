public class Main {

    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();

        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.inserir(40);
        lista.inserir(50);
        lista.inserir(60);

        lista.imprimir();
        lista.remover(6);
        lista.imprimir();
    }
}
