public class BuscaBinariaRecursiva {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,48};
        int pos = BuscaBinaria(array,0, array.length-1,6);
        System.out.println(pos);
        
    }

    public static int BuscaBinaria(int[] array, int inicio, int fim,int numero){
        int meio = (inicio + fim)/2;
        if(inicio <= fim){
            if(numero == array[meio])
                return  meio;
            else if(numero > array[meio]){
                return BuscaBinaria(array, meio + 1, fim, numero);
            }else if(numero < array[meio]){
                return BuscaBinaria(array, inicio, meio - 1, numero);
            }
        }
        return -1;
    }

}
