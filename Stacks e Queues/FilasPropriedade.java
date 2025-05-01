public class FilasPropriedade {
    private int[] array;
    private int front = 0,rear = 0;

    public  int posicao(int[] array, int valor){
        int aux = valor, i;
        for(i = array.length-1; (i>0) && (valor > array[i-1]); i--){
            array[i] = array[i-1];
        }   
        return i;
    }


    public FilasPropriedade(int tamanho){
        array = new int[tamanho];
        front = 0;
        rear = 0;
    }

    public int size(){ return array.length; }

    public boolean isEmpty(){ return rear == 0; }

    public boolean isFull(){ return rear == array.length; }

    public int front(){ return array[front]; }

    public void insert(int valor){ 
        if(!isFull()){
            array[posicao(array, valor)] = valor;
            rear++;
        }
    }

    public int remove(){
        int temp = array[front++];
        return temp;
    }
}
