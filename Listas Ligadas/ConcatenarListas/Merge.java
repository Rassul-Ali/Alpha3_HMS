public class Merge{
    public static void merge(ListaSimplismenteLigada l1, ListaSimplismenteLigada l2){
        l1.retornaUltimo().proximo = l2.primeiro;
    }
}