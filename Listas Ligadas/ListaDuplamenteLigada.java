public class ListaDuplamenteLigada {
    NodoDuplo primeiro;

    public ListaDuplamenteLigada(){
        primeiro = null;
    }

    public void inserirPrimeiro(int valor){
        NodoDuplo novo = new NodoDuplo(valor);
        
        if(primeiro == null){
            primeiro = novo;    
        }else{
            primeiro.anterior = novo;
            novo.proximo = primeiro;
            primeiro = novo;
        }
    }

    public void MostrarListaDupla(){
        NodoDuplo atual = primeiro;
        
        while(atual != null){
            System.out.println("O id e: " + atual.id + " e  O valor e: " + atual.valor);
            atual = atual.proximo; 
        }
        System.out.println();
    }

    public NodoDuplo busca(int id){
        NodoDuplo atual = primeiro;

        while(atual.id != id){
            if(atual.id == id)
                return atual;
            atual = atual.proximo;
        }

        return atual;
    }


}
