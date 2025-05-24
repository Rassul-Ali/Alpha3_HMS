import java.util.*;

public class PrimSpanning {
    public static List<ArestaSpanning> encontrarMST(GrafoSpanning grafo) {
        int vertices = grafo.getVertices();
        List<ArestaSpanning> mst = new ArrayList<>();
        boolean[] visitados = new boolean[vertices];
        PriorityQueue<ArestaSpanning> filaPrioridade = new PriorityQueue<>();

        // Começa pelo vértice 0
        visitados[0] = true;
        adicionarArestasVizinhas(0, grafo, filaPrioridade, visitados);

        while (!filaPrioridade.isEmpty() && mst.size() < vertices - 1) {
            ArestaSpanning aresta = filaPrioridade.poll();
            int proximoVertice = aresta.destino;

            if (!visitados[proximoVertice]) {
                visitados[proximoVertice] = true;
                mst.add(aresta);
                adicionarArestasVizinhas(proximoVertice, grafo, filaPrioridade, visitados);
            }
        }

        return mst;
    }

    private static void adicionarArestasVizinhas(int vertice, GrafoSpanning grafo, 
            PriorityQueue<ArestaSpanning> fila, boolean[] visitados) {
        for (ArestaSpanning aresta : grafo.getArestas()) {
            if (aresta.origem == vertice && !visitados[aresta.destino]) {
                fila.add(aresta);
            }
        }
    }

    public static void imprimirMST(List<ArestaSpanning> mst) {
        System.out.println("Árvore Geradora Mínima (Prim):");
        int pesoTotal = 0;
        for (ArestaSpanning aresta : mst) {
            System.out.println(aresta.origem + " - " + aresta.destino + " : " + aresta.peso);
            pesoTotal += aresta.peso;
        }
        System.out.println("Peso total: " + pesoTotal);
    }
}