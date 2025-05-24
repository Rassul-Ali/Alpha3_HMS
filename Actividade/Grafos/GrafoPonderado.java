public class GrafoPonderado {
    private int[][] matriz;
    private int numVertices;
    private static final int SEM_ARESTA = 0;
    
    public GrafoPonderado(int numVertices) {
        this.numVertices = numVertices;
        matriz = new int[numVertices][numVertices];
    }
    
    public void adicionarAresta(int origem, int destino, int peso) {
        matriz[origem][destino] = peso;
        matriz[destino][origem] = peso; // Não direcionado
    }
    
    public void imprimir() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}