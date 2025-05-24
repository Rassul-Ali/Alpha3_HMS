public class BuscaProfundidade {
    public void executar(GrafoListaAdjacencia grafo, int inicio) {
        boolean[] visitado = new boolean[grafo.getNumVertices()];
        System.out.println("Busca em Profundidade (DFS):");
        dfsRecursivo(grafo, inicio, visitado);
        System.out.println();
    }
    
    private void dfsRecursivo(GrafoListaAdjacencia grafo, int vertice, boolean[] visitado) {
        visitado[vertice] = true;
        System.out.print(vertice + " ");
        
        No atual = grafo.getAdjacencias()[vertice].getCabeca();
        while (atual != null) {
            if (!visitado[atual.valor]) {
                dfsRecursivo(grafo, atual.valor, visitado);
            }
            atual = atual.proximo;
        }
    }
}