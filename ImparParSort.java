import java.util.Arrays;

public class ImparParSort {
    public static void main(String[] args) {
        int[] array = {8, 3, 1, 7, 0, 10, 2, 5};
        
        System.out.println("arrayay Original: " + Arrays.toString(array));
        
        oddEvenSort(array);
        
        System.out.println("arrayay Ordenado: " + Arrays.toString(array));
    }

    public static void oddEvenSort(int[] array) {
        boolean ordenado = false;
        while (!ordenado) {
            ordenado = true;
            
            for (int i = 1; i < array.length - 1; i += 2) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    ordenado = false;
                }
            }
            
            for (int i = 0; i < array.length - 1; i += 2) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    ordenado = false;
                }
            }
        }
    }
}
