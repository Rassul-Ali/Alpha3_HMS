public class ListaDuasPontas {
    NodoDuplaPonta primeiro;
    NodoDuplaPonta ultimo;

    public ListaDuasPontas(){
        primeiro = null;
    }

    public void inserirPrimeiro(int valor){
        NodoDuplaPonta novo = new NodoDuplaPonta(valor);
        if(primeiro == null){
            primeiro = novo;
            ultimo = novo;
        }else{
            primeiro.ultimo = null;
            novo.proximo = primeiro;
            primeiro = novo;
            primeiro.ultimo = ultimo;
        }
    }

    public NodoDuplaPonta busca(int id){
        NodoDuplaPonta atual = primeiro;

        while(atual.id != id){
            if(atual.id == id)
                return atual;
            atual = atual.proximo;
        }

        return atual;
    }

    public void MostrarListaDuplaPonta(){
        NodoDuplaPonta atual = primeiro;
        
        while(atual != null){
            System.out.println("O id e: " + atual.id + " e  O valor e: " + atual.valor);
            atual = atual.proximo; 
        }
        System.out.println();
    }

}
