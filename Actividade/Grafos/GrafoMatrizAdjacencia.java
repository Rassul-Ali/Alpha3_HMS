public class GrafoMatrizAdjacencia {
    private int[][] matriz;
    private int numVertices;
    
    public GrafoMatrizAdjacencia(int numVertices) {
        this.numVertices = numVertices;
        matriz = new int[numVertices][numVertices];
    }
    
    public void adicionarAresta(int origem, int destino) {
        matriz[origem][destino] = 1;
        matriz[destino][origem] = 1; // Não direcionado
    }
    
    public void imprimir() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}