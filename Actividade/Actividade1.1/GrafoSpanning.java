import java.util.ArrayList;
import java.util.List;

public class GrafoSpanning {
    private int vertices;
    private List<ArestaSpanning> arestas;

    public GrafoSpanning(int vertices) {
        this.vertices = vertices;
        this.arestas = new ArrayList<>();
    }

    public void adicionarAresta(int origem, int destino, int peso) {
        arestas.add(new ArestaSpanning(origem, destino, peso));
        // Para grafos não direcionados
        arestas.add(new ArestaSpanning(destino, origem, peso));
    }

    public List<ArestaSpanning> getArestas() {
        return arestas;
    }

    public int getVertices() {
        return vertices;
    }
}