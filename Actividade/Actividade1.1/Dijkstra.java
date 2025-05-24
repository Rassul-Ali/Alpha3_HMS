import java.util.Arrays;
import java.util.PriorityQueue;

public class Dijkstra {
    public static int[] encontrarCaminhosMaisCurto(Grafo grafo, int origem) {
        int vertices = grafo.getVertices();
        int[] distancias = new int[vertices];
        boolean[] visitados = new boolean[vertices];
        
        Arrays.fill(distancias, Integer.MAX_VALUE);
        distancias[origem] = 0;

        // Fila de prioridade para processar os vértices
        PriorityQueue<Aresta> filaPrioridade = new PriorityQueue<>(
            (a, b) -> a.peso - b.peso
        );
        
        filaPrioridade.add(new Aresta(origem, 0));

        while (!filaPrioridade.isEmpty()) {
            Aresta atual = filaPrioridade.poll();
            int u = atual.destino;

            if (visitados[u]) continue;
            visitados[u] = true;

            for (Aresta aresta : grafo.getAdjacencias(u)) {
                int v = aresta.destino;
                int peso = aresta.peso;

                if (!visitados[v] && distancias[u] + peso < distancias[v]) {
                    distancias[v] = distancias[u] + peso;
                    filaPrioridade.add(new Aresta(v, distancias[v]));
                }
            }
        }

        return distancias;
    }

    public static void imprimirCaminhos(int[] distancias, int origem) {
        System.out.println("Caminhos mais curtos do vértice " + origem + ":");
        for (int i = 0; i < distancias.length; i++) {
            if (distancias[i] == Integer.MAX_VALUE) {
                System.out.println("Vértice " + i + ": Inalcançável");
            } else {
                System.out.println("Vértice " + i + ": " + distancias[i]);
            }
        }
    }
}