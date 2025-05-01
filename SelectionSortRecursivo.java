public class SelectionSortRecursivo {
    public static void main(String[] args) {
        int[] array = {5,4,2,45,87,1,3,5,4,58,96,78,11,0,32,1};
        for (int i : array) {
            System.out.print(i+ " ");
        }
        System.out.println();

        SelectionSort(array, 0);

        for (int i : array) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }

    public static void SelectionSort(int[] array, int inicio){
        int n = array.length;
        int menor = inicio;
        
        if(inicio > n)
            return;
            
        for(int i = inicio + 1; i < n; i++){
                if(array[i] < array[menor])
                menor = i;
        }
        
        if(menor != inicio){
            int troca = array[menor];
            array[menor] = array[inicio];
            array[inicio] = troca;
        }
        
        SelectionSort(array, inicio+1);
    }

}
