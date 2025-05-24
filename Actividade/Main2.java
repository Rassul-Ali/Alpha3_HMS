public class Main2 {
    public static void main(String[] args) {
        //System.out.println("=== TESTE LISTA CIRCULAR ===");
        //testListaCircular();
        
        //System.out.println("\n=== TESTE PROBLEMA DE JOSEFO ===");
        //testProblemaJosefo();
        
        //System.out.println("\n=== TESTE LISTA BIDIMENSIONAL SIMPLES ===");
        //testListaBidimensionalSimples();
        
        System.out.println("\n=== TESTE LISTA BIDIMENSIONAL DUPLA ===");
        testListaBidimensionalDupla();
        
        //System.out.println("\n=== TESTE REMOVER MAIORES QUE VALOR ===");
        //testRemoverMaioresQue();
        
        //System.out.println("\n=== TESTE INTERCALAR LISTAS ===");
        //testIntercalarListas();

        //System.out.println("\n=== TESTE FILAS COM PRIORIDADE ===");
        //filasPrioridade();
    }
    
    public static void testListaCircular() {
        ListaCircular lista = new ListaCircular();
        
        System.out.println("Inserindo valores 1, 2, 3, 4, 5");
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        lista.inserir(4);
        lista.inserir(5);
        lista.imprimir();
        
        System.out.println("Procurando valor 3: " + lista.procurar(3));
        System.out.println("Procurando valor 6: " + lista.procurar(6));
        
        System.out.println("Removendo valor 3: " + lista.remover(3));
        lista.imprimir();
        System.out.println("Removendo valor 1: " + lista.remover(1));
        lista.imprimir();
    }
    
    public static void testProblemaJosefo() {
        System.out.println("Caso com 7 pessoas, passo 3, começando em 1:");
        ProblemaJosefo.resolver(7, 3, 1);
        
        System.out.println("\nCaso com 20 pessoas, passo 9, começando em 7:");
        ProblemaJosefo.resolver(20, 9, 7);
    }
    
    public static void testListaBidimensionalSimples() {
        ListaBidimensionalSimples matriz = new ListaBidimensionalSimples(3, 4);
        
        System.out.println("Preenchendo matriz 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz.setValor(i, j, (i * 10 + j)+1);
            }
        }
        
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz.getValor(i, j) + "\t");
            }
            System.out.println();
        }
    }
    
    public static void testListaBidimensionalDupla() {
        ListaBidimensionalDupla matriz = new ListaBidimensionalDupla(3, 3);
        
        System.out.println("Preenchendo matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz.setValor(i, j, (i + 1) * 100 + (j + 1));
            }
        }
        
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz.getValor(i, j) + "\t");
            }
            System.out.println();
        }
    }
    
    public static void testRemoverMaioresQue() {
        ListaSimples lista = new ListaSimples();
        
        System.out.println("Inserindo valores 10, 5, 15, 2, 20, 8");
        lista.inserir(10);
        lista.inserir(5);
        lista.inserir(15);
        lista.inserir(2);
        lista.inserir(20);
        lista.inserir(8);
        lista.imprimir();
        
        System.out.println("Removendo valores maiores que 10");
        lista.removerMaioresQue(10);
        lista.imprimir();
        
        System.out.println("Removendo valores maiores que 5");
        lista.removerMaioresQue(5);
        lista.imprimir();
    }
    
    public static void testIntercalarListas() {
        Lista lista1 = new Lista();
        lista1.inserir('a');
        lista1.inserir('b');
        lista1.inserir('c');
        lista1.inserir('d');
        
        Lista lista2 = new Lista();
        lista2.inserir('e');
        lista2.inserir('f');
        lista2.inserir('g');
        lista2.inserir('h');
        
        System.out.println("Lista 1 antes:");
        lista1.imprimir();
        System.out.println("Lista 2 antes:");
        lista2.imprimir();
        
        IntercaladorListas.intercalar(lista1, lista2);
        
        System.out.println("Lista 1' depois:");
        lista1.imprimir();
        System.out.println("Lista 2' depois:");
        lista2.imprimir();
    }

    public static void filasPrioridade(){
        FilasPropriedade filas = new FilasPropriedade();

        filas.insert(80);
        filas.insert(50);
        filas.insert(1);
        filas.insert(350);
        filas.insert(100);
        
        System.out.println(filas.front());
        filas.remove();
        System.out.println(filas.front());

    }
}