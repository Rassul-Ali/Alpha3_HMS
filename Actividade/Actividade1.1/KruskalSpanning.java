import java.util.*;

public class KruskalSpanning {
    static class Subconjunto {
        int pai;
        int rank;
    }

    public static List<ArestaSpanning> encontrarMST(GrafoSpanning grafo) {
        int vertices = grafo.getVertices();
        List<ArestaSpanning> mst = new ArrayList<>();
        List<ArestaSpanning> arestas = new ArrayList<>(grafo.getArestas());
        Collections.sort(arestas);

        Subconjunto[] subconjuntos = new Subconjunto[vertices];
        for (int i = 0; i < vertices; i++) {
            subconjuntos[i] = new Subconjunto();
            subconjuntos[i].pai = i;
            subconjuntos[i].rank = 0;
        }

        int i = 0;
        while (mst.size() < vertices - 1 && i < arestas.size()) {
            ArestaSpanning proximaAresta = arestas.get(i++);
            int x = encontrar(subconjuntos, proximaAresta.origem);
            int y = encontrar(subconjuntos, proximaAresta.destino);

            if (x != y) {
                mst.add(proximaAresta);
                unir(subconjuntos, x, y);
            }
        }

        return mst;
    }

    private static int encontrar(Subconjunto[] subconjuntos, int i) {
        if (subconjuntos[i].pai != i)
            subconjuntos[i].pai = encontrar(subconjuntos, subconjuntos[i].pai);
        return subconjuntos[i].pai;
    }

    private static void unir(Subconjunto[] subconjuntos, int x, int y) {
        int raizX = encontrar(subconjuntos, x);
        int raizY = encontrar(subconjuntos, y);

        if (subconjuntos[raizX].rank < subconjuntos[raizY].rank)
            subconjuntos[raizX].pai = raizY;
        else if (subconjuntos[raizX].rank > subconjuntos[raizY].rank)
            subconjuntos[raizY].pai = raizX;
        else {
            subconjuntos[raizY].pai = raizX;
            subconjuntos[raizX].rank++;
        }
    }

    public static void imprimirMST(List<ArestaSpanning> mst) {
        System.out.println("Árvore Geradora Mínima (Kruskal):");
        int pesoTotal = 0;
        for (ArestaSpanning aresta : mst) {
            System.out.println(aresta.origem + " - " + aresta.destino + " : " + aresta.peso);
            pesoTotal += aresta.peso;
        }
        System.out.println("Peso total: " + pesoTotal);
    }
}