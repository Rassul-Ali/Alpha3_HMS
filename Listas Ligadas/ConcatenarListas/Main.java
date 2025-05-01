public class Main {
    public static void main(String[] args) {
        ListaSimplismenteLigada lista1 = new ListaSimplismenteLigada();

        lista1.inserirPrimeiro(10);
        lista1.inserirPrimeiro(20);
        lista1.inserirPrimeiro(30);
        lista1.inserirPrimeiro(40);
        lista1.inserirPrimeiro(50);
        lista1.inserirPrimeiro(60);   
        
        //System.out.println(lista1.removerPrimerio());
        //System.out.println(lista1.removerPrimerio());
        
        ListaSimplismenteLigada lista2 = new ListaSimplismenteLigada();

        lista2.inserirPrimeiro(70);
        lista2.inserirPrimeiro(80);
        lista2.inserirPrimeiro(90);
        lista2.inserirPrimeiro(100);
        lista2.inserirPrimeiro(110);
        lista2.inserirPrimeiro(120);

        Merge.merge(lista1, lista2);
        
        lista1.MostrarLista();
        //lista2.MostrarLista();


        FilasPropriedade filas = new FilasPropriedade();

        filas.insert(80);
        filas.insert(50);
        filas.insert(10);
        filas.insert(350);
        filas.insert(100);

        System.out.println(filas.front());
        filas.remove();
        System.out.println(filas.front());
    
    }

}
