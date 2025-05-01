import java.util.*;

public class BucketSort {

        public static void main(String[] args) {
        float[] array = {1,65,23,45,98,2,4};
        
        System.out.println("arrayay Original: " + Arrays.toString(array));

        bucketSort(array);
        
        System.out.println("Array Ordenado: " + Arrays.toString(array));
    }

    
    @SuppressWarnings("unchecked")
    public static void bucketSort(float[] array) {
        if (array.length <= 1) {
            return;
        }

        
        float minValue = array[0];
        float maxValue = array[0];
        for (float num : array) {
            if (num < minValue) minValue = num;
            if (num > maxValue) maxValue = num;
        }

        
        int bucketCount = (int) Math.sqrt(array.length);
        List<Float>[] buckets = new List[bucketCount];
        for (int i = 0; i < bucketCount; i++) {
            buckets[i] = new ArrayList<>();
        }

        
        for (float num : array) {
            int index = (int) ((num - minValue) / (maxValue - minValue) * (bucketCount - 1));
            buckets[index].add(num);
        }

        
        int arrayIndex = 0;
        for (List<Float> bucket : buckets) {
            Collections.sort(bucket);
            for (float num : bucket) {
                array[arrayIndex++] = num;
            }
        }
    }


}