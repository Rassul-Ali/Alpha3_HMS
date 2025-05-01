public class Pilha{
    private int[] array;
    private int topo;

    public Pilha(int tamanho){
        array = new int[tamanho];
        topo = -1;
    }

    public int size(){ return array.length; }

    public boolean isEmpty(){ return topo == -1; }

    public boolean isFull(){ return topo == array.length; }

    public int peek(){ return array[topo]; }

    public void push(int valor){ 
        if(isFull() == false){
            array[++topo] = valor; 
        }
    }

    public int pop(){
        int temp = array[topo--];
        return temp;
    }
}