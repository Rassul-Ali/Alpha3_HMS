
import java.util.Arrays;

public class InsertionSortRecursivo {
    static int counterComparacao = 0, counterCopia = 0;
    public static void main(String[] args) {
        int[] array = {5,4,2,45,87,1,3,5,4,58,96,78,11,0,32,1};

        System.out.println("Array Original: " + Arrays.toString(array));

        InsertionSort(array, array.length-1);

        System.out.println("Array Ordenado: " + Arrays.toString(array));
    }

    public static void InsertionSort(int[] array, int n){
        int aux = array[n], i;
        if(n == 0)
            return;

        InsertionSort(array, n - 1);

        for(i = n; (i>0) && (aux < array[i-1]); i--){
            array[i] = array[i-1];
            counterCopia++;
        }
        
        counterComparacao++;
        array[i] = aux;
    }
    
}
