public class Main {
    public static void main(String[] args) {
        // Criando grafo não direcionado
        GrafoListaAdjacencia grafo = new GrafoListaAdjacencia(5);
        grafo.adicionarAresta(0, 1);
        grafo.adicionarAresta(0, 4);
        grafo.adicionarAresta(1, 2);
        grafo.adicionarAresta(1, 3);
        grafo.adicionarAresta(1, 4);
        grafo.adicionarAresta(2, 3);
        grafo.adicionarAresta(3, 4);
        
        System.out.println("Lista de Adjacência:");
        grafo.imprimir();
        
        // Executando buscas
        BuscaLargura bfs = new BuscaLargura();
        bfs.executar(grafo, 0);
        
        BuscaProfundidade dfs = new BuscaProfundidade();
        dfs.executar(grafo, 0);
        
        // Grafo direcionado
        /*GrafoDirecionado grafoDir = new GrafoDirecionado(4);
        grafoDir.adicionarAresta(0, 1);
        grafoDir.adicionarAresta(0, 2);
        grafoDir.adicionarAresta(1, 2);
        grafoDir.adicionarAresta(2, 3);
        
        System.out.println("\nGrafo Direcionado:");
        grafoDir.imprimir();
        
        // Grafo ponderado
        GrafoPonderado grafoPond = new GrafoPonderado(4);
        grafoPond.adicionarAresta(0, 1, 5);
        grafoPond.adicionarAresta(0, 2, 3);
        grafoPond.adicionarAresta(1, 2, 1);
        grafoPond.adicionarAresta(2, 3, 7);
        
        System.out.println("\nGrafo Ponderado:");
        grafoPond.imprimir();*/
    }
}