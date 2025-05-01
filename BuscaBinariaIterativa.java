public class BuscaBinariaIterativa {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,45};
        int pos = BuscaBinaria(array,1);
        System.out.println(pos);
        
    }

    public static int BuscaBinaria(int[] array, int numero){
        int inicio =0;
        int fim = array.length-1;
        int meio;

        while(inicio <= fim){
            meio = (inicio+fim)/2;
            if(numero == array[meio])
                return meio;
            else if(numero > array[meio])
                inicio = meio + 1;
            else if(numero < array[meio])
                fim = meio - 1;
        }
        return -1;
    }

}
