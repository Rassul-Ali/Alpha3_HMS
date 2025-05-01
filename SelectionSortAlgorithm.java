public class SelectionSortAlgorithm {
    static int counter = 0;
    public static void main(String[] args) {
        
        int[] array = {32,32,45,56,76,56,76};
        System.out.println("Array Original:");
        PrintArray(array);

        System.out.println("Array Ordenado:");
        SelectionSort(array);
        PrintArray(array);

        System.out.println("Array Removido:");
        removerduplicados(array);

        PrintArray(array);

    }


    public static void removerduplicados(int[] array){
        SelectionSort(array);

        for(int i =0; i < array.length; i++){
            if(i+1 < array.length){              
                if(array[i] == array[i+1]){
                    array[i] = 0;
                }
            }
        }
        ordenacao(array);
    }

    public static void ordenacao(int array[]){
        int count = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] == 0){
                for(int j = i; j < array.length; j++){
                    if(j+1 < array.length)
                        array[j] = array[j+1];
                    
                }
                count++;
                i--;
            }
        }
        for(int i = array.length - count; i < array.length; i++)
            array[i] = 0;
    }

    private static void PrintArray(int[] array){
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
