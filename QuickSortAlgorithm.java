public class QuickSortAlgorithm {
    public static void main(String[] args) {
        int[] array = {5,4,2,45,87,1,3,5,4,58,96,78,11,0,32,1};
        System.out.println("Array Original:");
        for (int i : array) {
            System.out.print(i+ " ");
        }
        System.out.println();
        quickSort(array, 0, array.length-1);
        
        System.out.println("Array Ordenado:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        
        System.out.println();
        
    }

    private static int particionar(int[] array, int inicio, int fim){
        int esq = inicio;
        int dir = fim;
        int pivo = array[inicio];
        int aux;

        while(esq<dir){

            while(esq <= fim && array[esq] <= pivo)
                esq++;

            while(dir >= 0 && array[dir] > pivo)
                dir--;

            if(esq < dir){
                aux = array[esq];
                array[esq] = array[dir];
                array[dir] = aux;
            }
        }

        array[inicio] = array[dir];
        array[dir] = pivo;

        return dir;
    }

    private static void quickSort(int[] array, int incio, int fim){
        if(incio < fim){
            int pivo = particionar(array, incio, fim);
            quickSort(array, incio, pivo-1);
            quickSort(array, pivo+1, fim);
        }
    }

}
