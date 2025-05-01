import java.util.Arrays;

public class InsertionSortAlgorithm {
    static int counterComparacao = 0, counterCopia = 0;
    public static void main(String[] args) {
        int[] array = {5,4,2,45,87,1,3,5,4,58,96,78,11,0,32,1};
        System.out.println("Array Original: " + Arrays.toString(array));

        InsertionSort(array);

        System.out.println("Array Ordenado: " + Arrays.toString(array));
        int total = (counterComparacao + counterCopia);
        
        System.out.println("\n\n\n" + total + "\n" + (array.length*array.length));
    }

    public static void InsertionSort(int[] array){
        int aux, i, j;
        for(i = 0; i< array.length; i++){
            aux = array[i];
            for(j = i; (j>0) && (aux < array[j-1]); j--){
                array[j] = array[j-1];
                counterCopia++;
            }

            counterComparacao++;
            array[j] = aux;
            
        }
    }
}