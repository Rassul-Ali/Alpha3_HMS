import java.util.Arrays;

public class BubbleSortAlgorithm {
    static int counter = 0;
    public static void main(String[] args) {
        int[] array = {5,4,2,45,87,1,3,5,4,58,96,78,11,0,32,1};
        System.out.println("Array Original: " + Arrays.toString(array));

        BubbleSort(array);

        System.out.println("Array Ordenado: " + Arrays.toString(array));
        //System.out.println("\n\n\n\n" + counter + "\n" +array.length);
    }

    public static void BubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            counter++;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;  
                }
            }
        }
    } 

}
