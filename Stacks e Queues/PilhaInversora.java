public class PilhaInversora {
    private Character[] array;
    int topo;

    public PilhaInversora(int tamanho){
        array = new Character[tamanho];
        topo = -1;
    }

    public int size(){ return array.length; }

    public boolean isEmpty(){ return topo == -1; }

    public boolean isFull(){ return topo == array.length; }

    public Character  peek(){ return array[topo]; }

    public void push(Character valor){ 
        if(!isFull()){
            array[++topo] = valor; 
        }
    }

    public Character pop(){
        Character temp = array[topo--];
        return temp;
    }
}
