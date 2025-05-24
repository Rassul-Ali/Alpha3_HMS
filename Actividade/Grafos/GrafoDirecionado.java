public class GrafoDirecionado {
    private ListaLigada[] adjacencias;
    private int numVertices;
    
    public GrafoDirecionado(int numVertices) {
        this.numVertices = numVertices;
        adjacencias = new ListaLigada[numVertices];
        for (int i = 0; i < numVertices; i++) {
            adjacencias[i] = new ListaLigada();
        }
    }
    
    public void adicionarAresta(int origem, int destino) {
        adjacencias[origem].adicionar(destino); // Apenas uma direção
    }
    
    public void imprimir() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vértice " + i + ": ");
            No atual = adjacencias[i].getCabeca();
            while (atual != null) {
                System.out.print(atual.valor + " ");
                atual = atual.proximo;
            }
            System.out.println();
        }
    }
}