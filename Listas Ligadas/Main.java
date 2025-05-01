
public class Main {

    public static void main(String[] args) {
        /*ListaSimplismenteLigada lista = new ListaSimplismenteLigada();

        lista.inserirPrimeiro(10);
        lista.inserirSegundo(20);
        lista.inserirSegundo(30);
        lista.inserirSegundo(40);
        lista.inserirSegundo(50);
        lista.inserirSegundo(60);*/

 /* 
        ListaDuplamenteLigada lista = new ListaDuplamenteLigada();

        lista.inserirPrimeiro(10);
        lista.inserirPrimeiro(20);
        lista.inserirPrimeiro(30);
        lista.inserirPrimeiro(40);
        lista.inserirPrimeiro(50);
        lista.inserirPrimeiro(60);

        lista.MostrarListaDupla();

        System.out.println(lista.busca(2).anterior.id +  "\n"  + lista.busca(2).id + "\n" + lista.busca(2).proximo.id);*/
        //System.out.println("O elemento foi eliminado: " + lista.removerPrimerio() + "\n");
        //lista.MostrarLista(); 

        /* 
        ListaDuasPontas lista  = new ListaDuasPontas();

        lista.inserirPrimeiro(10);
        lista.inserirPrimeiro(20);
        lista.inserirPrimeiro(30);
        lista.inserirPrimeiro(40);
        lista.inserirPrimeiro(50);
        lista.inserirPrimeiro(60);

        lista.MostrarListaDuplaPonta();

        System.out.println(lista.busca(6).ultimo.valor);*/
        ListaCirlurar lista = new ListaCirlurar();

        lista.inserirPrimeiro(10);
        lista.inserirPrimeiro(20);
        //lista.inserirPrimeiro(30);
        //lista.inserirPrimeiro(40);
        //lista.inserirPrimeiro(50);
        //lista.inserirPrimeiro(60);

        lista.inserirFim(70);
        lista.inserirFim(80);
        lista.inserirFim(90);
        lista.inserirFim(100);
        lista.inserirFim(110);
        lista.inserirFim(120);

        lista.MostrarListaCircular();
        lista.removerUltimo();
        lista.MostrarListaCircular();

    }
}