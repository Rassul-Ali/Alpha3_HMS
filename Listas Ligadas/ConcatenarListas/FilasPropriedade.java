public class FilasPropriedade {
    private ListaSimplismenteLigada array = new ListaSimplismenteLigada();

    public int size(){ 
        int count = 0;
        while(array.primeiro != null){
            count++;
            array.primeiro = array.primeiro.proximo;
        }
        return count;
    }

    public boolean isEmpty(){ return array.primeiro == null; }

    //public boolean isFull(){ return rear == array.length; }

    public int front(){ return array.retornaUltimo().valor; }

    public void insert(int valor){ 
        array.inserir(valor);
    }

    public int remove(){
        int temp = array.removerUltimo2();
        return temp;
    }
}
