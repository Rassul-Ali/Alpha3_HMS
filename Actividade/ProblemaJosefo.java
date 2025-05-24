public class ProblemaJosefo {
    public static void resolver(int pessoas, int passo, int inicio) {
        ListaCircular lista = new ListaCircular();
        
        // Preenche a lista com as pessoas (1..20)
        for (int i = 1; i <= pessoas; i++) {
            lista.inserir(i);
        }
        
        // Posiciona no ponto de início
        while (lista.atual.valor != inicio) {
            lista.atual = lista.atual.proximo;
        }
        
        System.out.println("Pessoas eliminadas:");
        while (lista.atual.proximo != lista.atual) {
            // Conta 'passo' pessoas (incluindo a atual)
            for (int i = 1; i < passo; i++) {
                lista.atual = lista.atual.proximo;
            }
            
            // Elimina a pessoa ATUAL (não a próxima)
            int eliminado = lista.atual.valor;
            System.out.print(eliminado + " ");
            
            // Encontra o nó anterior para fazer a remoção
            Nodo anterior = lista.atual;
            while (anterior.proximo != lista.atual) {
                anterior = anterior.proximo;
            }
            
            // Remove o nó atual
            anterior.proximo = lista.atual.proximo;
            lista.atual = anterior.proximo; // Avança para o próximo
        }
        
        System.out.println("\nSobrevivente: " + lista.atual.valor);
    }
}