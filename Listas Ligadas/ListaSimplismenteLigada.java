public class ListaSimplismenteLigada {
    Nodo primeiro;

    public ListaSimplismenteLigada(){ primeiro = null;}

    public void inserirPrimeiro(int valor){
        Nodo novo = new Nodo(valor);
        novo.proximo = primeiro;
        primeiro = novo;
    }

    public void inserirSegundo(int valor){
        if(primeiro != null){            
            Nodo novo = new Nodo(valor);
            novo.proximo = primeiro.proximo;
            primeiro.proximo = novo;
        }else
            System.err.println("Primeira Posicao Vazia");
    }

    public  boolean remover1(int id){
        Nodo atual = primeiro;

        while(atual != null){
            if(atual.id == id){
                primeiro = atual.proximo;
                return  true;
            }else if(atual.proximo != null){
                if(atual.proximo.id == id){
                    atual.proximo = atual.proximo.proximo;
                    return true;
                }
            }
            atual = atual.proximo;
        }

        return false;
    }

    public  boolean remover2(int id){
        Nodo atual = primeiro;
        Nodo anterior = primeiro;

        while(atual.id != id){
            
            if(atual.proximo == null)
                return false;
            else
                anterior = atual;

            atual = atual.proximo;
        }
        if(atual == primeiro)
            primeiro = atual.proximo;
        else
            anterior.proximo = atual.proximo;
        return true;
    }

    public boolean removerUltimo1(){
        Nodo atual = primeiro;
        while(atual != null){
            
            if(atual.id == 2){
                atual.proximo = null;
            }     
            atual = atual.proximo;
        }
        return true;
    }

    public boolean removerUltimo2(){
        Nodo atual = primeiro;
        Nodo anterior = primeiro;
        while(atual.proximo != null){
            anterior = atual;
            atual = atual.proximo;
        }
        if(atual == primeiro)
            primeiro = null;
        else
            anterior.proximo = null;
        return true;
    }

    public boolean removerPrimerio(){
        primeiro = primeiro.proximo;
        return true;
    }

    public Nodo busca(int id){
        Nodo atual = primeiro;

        while(atual.id != id){
            if(atual.id == id)
                return atual;
            atual = atual.proximo;
        }

        return atual;
    }

    public void MostrarLista(){
        Nodo atual = primeiro;
        
        while(atual != null){
            System.out.println("O id e: " + atual.id + " e  O valor e: " + atual.valor );
            atual = atual.proximo; 
        }
        System.out.println();
    }

}
