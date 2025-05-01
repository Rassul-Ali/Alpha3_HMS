public class ProblemaJosefo {
    public static void resolver(int pessoas, int passo, int inicio) {
        ListaCircular lista = new ListaCircular();
        
        
        for (int i = 1; i <= pessoas; i++) {
            lista.inserir(i);
        }
        
        
        while (lista.atual != null && lista.atual.valor != inicio) {
            lista.atual = lista.atual.proximo;
        }
        
        System.out.println("Pessoas eliminadas: ");
        while (lista.atual != lista.atual.proximo) {
            try {
                
                for (int i = 1; i < passo; i++) {
                    lista.atual = lista.atual.proximo;
                }
                
                System.out.println(lista.atual.proximo.valor);
                Thread.sleep(1000);
                lista.atual.proximo = lista.atual.proximo.proximo;
            } catch (InterruptedException ex) {
            }
        }
        System.out.println("\nSobrevivente: " + lista.atual.valor);
    }
}