public class Main {
    public static void main(String[] args) {
        /*ListaSimplismenteLigada lista1 = new ListaSimplismenteLigada();

        lista1.inserir(10);
        lista1.inserir(20);
        lista1.inserir(30);
        lista1.inserir(40);
        lista1.inserir(50);
        lista1.inserir(60);   
        
        //System.out.println(lista1.removerPrimerio());
        //System.out.println(lista1.removerPrimerio());
        
        ListaSimplismenteLigada lista2 = new ListaSimplismenteLigada();

        lista2.inserir(70);
        lista2.inserir(80);
        lista2.inserir(90);
        lista2.inserir(100);
        lista2.inserir(110);
        lista2.inserir(120);

        Merge.merge(lista1, lista2);
        
        lista1.MostrarLista();
        //lista2.MostrarLista();
        */

        FilasPropriedade filas = new FilasPropriedade();

        filas.insert(80);
        filas.insert(50);
        filas.insert(10);
        filas.insert(350);
        filas.insert(100);
        filas.insert(1);

        System.out.println(filas.front());
        filas.remove();
        System.out.println(filas.front());
    
    }

}
