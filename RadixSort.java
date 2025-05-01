
public class RadixSort {

    
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    
    public static void radixSort(int[] arr) {
        int max = getMax(arr);

        
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(arr, exp);
        }
    }

    
    public static void countingSortByDigit(int[] arr, int exp) {
        int[] output = new int[arr.length];
        int[] count = new int[10];  

        
        for (int num : arr) {
            count[(num / exp) % 10]++;
        }

        
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        
        for (int i = arr.length - 1; i >= 0; i--) {
            int num = arr[i];
            int digit = (num / exp) % 10;
            output[count[digit] - 1] = num;
            count[digit]--;
        }

        
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        
        System.out.println("Array original:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        
        radixSort(arr);
        
        System.out.println("Array ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}