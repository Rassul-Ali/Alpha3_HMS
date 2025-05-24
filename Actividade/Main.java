
public class Main {
    public static void main(String[] args) {
        Lista lista1 = new Lista();
        lista1.inserir('a');
        lista1.inserir('b');
        lista1.inserir('c');
        lista1.inserir('d');

        Lista lista2 = new Lista();
        lista2.inserir('e');
        lista2.inserir('f');
        lista2.inserir('g');
        lista2.inserir('h');

        System.out.println("Lista 1 antes:");
        lista1.imprimir();
        System.out.println("Lista 2 antes:");
        lista2.imprimir();

        IntercaladorListas.intercalar(lista1, lista2);

        System.out.println("Lista 1' depois:");
        lista1.imprimir();
        System.out.println("Lista 2' depois:");
        lista2.imprimir();

        ProblemaJosefo problemaJosefo = new ProblemaJosefo();

        problemaJosefo.resolver(20, 5, 1);
    }
}
