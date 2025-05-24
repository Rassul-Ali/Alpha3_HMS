public class BuscaLargura {
    public void executar(GrafoListaAdjacencia grafo, int inicio) {
        boolean[] visitado = new boolean[grafo.getNumVertices()];
        Fila fila = new Fila();
        
        visitado[inicio] = true;
        fila.enfileirar(inicio);
        
        System.out.println("Busca em Largura (BFS):");
        
        while (!fila.estaVazia()) {
            int vertice = fila.desenfileirar();
            System.out.print(vertice + " ");
            
            No atual = grafo.getAdjacencias()[vertice].getCabeca();
            while (atual != null) {
                if (!visitado[atual.valor]) {
                    visitado[atual.valor] = true;
                    fila.enfileirar(atual.valor);
                }
                atual = atual.proximo;
            }
        }
        System.out.println();
    }
}