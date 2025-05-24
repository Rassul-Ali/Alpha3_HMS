import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        testHeapOperations();
        testDijkstraAlgorithm();
        testSpanningAlgorithms();
    }

    // Função para testar operações no Heap
    private static void testHeapOperations() throws IOException {
        Heap theHeap = new Heap(31); 
        initializeHeap(theHeap);
        
        boolean running = true;
        while(running) {
            System.out.print("\nMenu do Heap:\n");
            System.out.print("(s)how, (i)nsert, (r)emove, (c)hange, (e)xit: ");
            char choice = getChar();
            
            switch(choice) {
                case 's' -> theHeap.displayHeap();
                case 'i' -> insertValue(theHeap);
                case 'r' -> removeValue(theHeap);
                case 'c' -> changeValue(theHeap);
                case 'e' -> running = false;
                default -> System.out.println("Opção inválida\n");
            }
        }
    }

    // Função para testar o algoritmo de Dijkstra
    private static void testDijkstraAlgorithm() {
        System.out.println("\nTestando o algoritmo de Dijkstra:");
        Grafo grafo = createSampleGraph();
        int origem = 0;
        int[] distancias = Dijkstra.encontrarCaminhosMaisCurto(grafo, origem);
        Dijkstra.imprimirCaminhos(distancias, origem);
    }

    // Função para testar algoritmos de Spanning Tree
    private static void testSpanningAlgorithms() {
        System.out.println("\nTestando algoritmos de Spanning Tree:");
        
        // Criar grafo para spanning trees
        GrafoSpanning grafoSpanning = createSampleSpanningGraph();
        
        System.out.println("\n=== Algoritmo de Prim ===");
        List<ArestaSpanning> mstPrim = PrimSpanning.encontrarMST(grafoSpanning);
        PrimSpanning.imprimirMST(mstPrim);
        
        System.out.println("\n=== Algoritmo de Kruskal ===");
        List<ArestaSpanning> mstKruskal = KruskalSpanning.encontrarMST(grafoSpanning);
        KruskalSpanning.imprimirMST(mstKruskal);
    }

    // Funções auxiliares para operações no Heap
    private static void initializeHeap(Heap heap) {
        heap.insert(70);
        heap.insert(40);
        heap.insert(50);
        heap.insert(20);
        heap.insert(60);
        heap.insert(100);
        heap.insert(80);
        heap.insert(30);
        heap.insert(10);
        heap.insert(90);
    }

    private static void insertValue(Heap heap) throws IOException {
        System.out.print("Digite o valor para inserir: ");
        int value = getInt();
        boolean success = heap.insert(value);
        if(!success)
            System.out.println("Não foi possível inserir; heap cheio");
    }

    private static void removeValue(Heap heap) {
        if(!heap.isEmpty())
            heap.remove();
        else
            System.out.println("Não foi possível remover; heap vazio");
    }

    private static void changeValue(Heap heap) throws IOException {
        System.out.print("Digite o índice atual do item: ");
        int value = getInt();
        System.out.print("Digite a nova chave: ");
        int value2 = getInt();
        boolean success = heap.change(value, value2);
        if(!success)
            System.out.println("Índice inválido");
    }

    // Função para criar um grafo de exemplo para Dijkstra
    private static Grafo createSampleGraph() {
        Grafo grafo = new Grafo(5);
        grafo.adicionarAresta(0, 1, 4);
        grafo.adicionarAresta(0, 2, 1);
        grafo.adicionarAresta(1, 3, 1);
        grafo.adicionarAresta(2, 1, 2);
        grafo.adicionarAresta(2, 3, 5);
        grafo.adicionarAresta(3, 4, 3);
        return grafo;
    }

    // Função para criar um grafo de exemplo para Spanning Trees
    private static GrafoSpanning createSampleSpanningGraph() {
        GrafoSpanning grafo = new GrafoSpanning(5);
        grafo.adicionarAresta(0, 1, 2);
        grafo.adicionarAresta(0, 3, 6);
        grafo.adicionarAresta(1, 2, 3);
        grafo.adicionarAresta(1, 3, 8);
        grafo.adicionarAresta(1, 4, 5);
        grafo.adicionarAresta(2, 4, 7);
        grafo.adicionarAresta(3, 4, 9);
        return grafo;
    }

    // Métodos utilitários de entrada
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }
    
    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}