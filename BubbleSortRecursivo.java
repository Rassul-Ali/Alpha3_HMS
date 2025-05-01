import java.util.Arrays;

public class BubbleSortRecursivo {
    public static void main(String[] args) {
        int[] array = {90,4,2,45,87,1,3,5,4,58,96,78,11,0,32,1};
        System.out.println("Array Original: " + Arrays.toString(array));

        BubbleSort(array, array.length-1);

        System.out.println("Array Ordenado: " + Arrays.toString(array));
        System.out.println();
        
    }

    public static void BubbleSort(int[] array, int n){
        if(n == 0 )
            return;

        for(int temp, i=0; i < n; i++){
            if(array[i] > array[n]){
                temp = array[n];
                array[n] = array[i];
            array[i] = temp;            
            }
        }

        BubbleSort(array, n - 1);
    }
}
