public class Mediana {
    public static void main(String[] args) {
        int[] array = {5,4,2,45,87,1,3,5,4,58,96,78,11,8,32,1};
        
        if(array.length % 2 == 0){
            System.out.println("O tamanho do array e = " + array.length +
            " Entao a sua mediana e " + array.length/2);
        }else{
            System.err.println("O tamanho do array e = " + array.length +
            " Entao a sua mediana e " + (array.length+1)/2);
        }

        int med = mediana(array);
        if(med == -1)
            System.out.println("Nao existe o valor mediana no array");
        else
            System.out.println("Existe o valor mediana no array = " + med);
        
    }

    private static int mediana(int[] array){
        int n = array.length;
        
        if(n % 2 == 1)
            n += 1;
        
        int medi = n/2;

        for(int i =0; i < array.length; i++){
            if(array[i] == medi)
                return array[i];
        }

        return -1;
    }
}
