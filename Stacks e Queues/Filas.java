public class Filas {
    private int[] array;
    private int front,rear;

    public Filas(int tamanho){
        array = new int[tamanho];
        front = 0;
        rear = -1;
    }

    public int size(){ return array.length; }

    public boolean isEmpty(){ return rear == -1; }

    public boolean isFull(){ return rear == array.length; }

    public int front(){ return array[front]; }

    public void insert(int valor){ 
        if(isFull() == false){
            array[++rear] = valor; 
        }
    }

    public int remove(){
        int temp = array[front++];
        return temp;
    }
}
