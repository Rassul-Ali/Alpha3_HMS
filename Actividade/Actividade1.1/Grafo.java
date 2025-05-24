import java.util.ArrayList;
import java.util.List;

public class Grafo {
    private int vertices;
    private List<List<Aresta>> adjacencias;

    public Grafo(int vertices) {
        this.vertices = vertices;
        this.adjacencias = new ArrayList<>(vertices);
        
        for (int i = 0; i < vertices; i++) {
            adjacencias.add(new ArrayList<>());
        }
    }

    public void adicionarAresta(int origem, int destino, int peso) {
        adjacencias.get(origem).add(new Aresta(destino, peso));
        // Para grafos não direcionados, adicione também a aresta inversa
        // adjacencias.get(destino).add(new Aresta(origem, peso));
    }

    public List<Aresta> getAdjacencias(int vertice) {
        return adjacencias.get(vertice);
    }

    public int getVertices() {
        return vertices;
    }
}