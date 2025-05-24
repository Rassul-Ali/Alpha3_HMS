
public class IntercaladorListas {

    public static void intercalar(Lista lista1, Lista lista2) {
        if (lista1.inicio == null || lista2.inicio == null) {
            return; // Não há o que intercalar se uma das listas estiver vazia
        }

        Lista.Nodo atual1 = lista1.inicio;
        Lista.Nodo atual2 = lista2.inicio;

        while (atual1 != null && atual2 != null) {
            // Guarda referências para os próximos nós
            Lista.Nodo proximo1 = atual1.proximo;
            Lista.Nodo proximo2 = atual2.proximo;

            // Faz a intercalação
            atual2.proximo = proximo1;
            atual1.proximo = atual2;

            // Atualiza os ponteiros para a próxima iteração
            atual1 = proximo1;
            atual2 = proximo2;
        }

        // A lista2 é esvaziada pois seus elementos foram incorporados em lista1
        lista2.inicio = null;
    }
}
