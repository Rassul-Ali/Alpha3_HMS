public class ListaCirlurar {

    //Criacao do Nodo circular
    NodoCircular primeiro;
    NodoCircular ultimo;
    int eliminar = 0;
    //Construtor e inicializacao da variavel NodoCircular
    public ListaCirlurar() {
        primeiro = null;
        ultimo = null;
        //ultimo1 = null;
    }

    //Metodo para Inserir primeiro
    public void inserirPrimeiro(int valor) {
        NodoCircular novo = new NodoCircular(valor);
        if (primeiro == null) {
            ultimo = novo;
        }
        novo.proximo = primeiro;
        primeiro = novo;
        ultimo.proximo = primeiro; //Busca sempre o ultimo e atribui a variavel primeiro o primeiro nodo
    }

    public void inserirFim(int valor) {
        NodoCircular novo = new NodoCircular(valor);
        if (primeiro == null) {
            primeiro = novo; 
            ultimo = novo;
            ultimo.proximo = primeiro;
        } else {
            novo.proximo = primeiro;
            ultimo.proximo = novo;
            ultimo = novo;
        }
    }

    //Metodo para mostrar lista
    public void MostrarListaCircular() {
        NodoCircular atual = primeiro;
        for (int i = 0; i < NodoCircular.inc - eliminar; ++i) {
            System.out.println(i + " O id e: " + atual.id + " e  O valor e: " + atual.valor);
            atual = atual.proximo;
        }
        System.out.println();
    }

    //Metodo de busca com parametro de id
    public NodoCircular busca(int id) {
        NodoCircular atual = primeiro;

        while (atual.id != NodoCircular.inc) {
            if (atual.id == id) {
                return atual;
            }
            atual = atual.proximo;
        }
        return atual;
    }

    public NodoCircular buscafim() {
        NodoCircular atual = primeiro;

        while (atual != null) {
            if (atual.proximo == null) {
                return atual;
            }
            atual = atual.proximo;
        }
        return null;
    }

    public  boolean removerUltimo(){
        NodoCircular atual = primeiro;
        NodoCircular anterior = primeiro;
        while(atual.proximo != primeiro){
            if(atual.proximo != primeiro){
                anterior = atual;
            }else{
                break;
            }
            atual = atual.proximo;
        }

        anterior.proximo = primeiro;
        eliminar++;
    return true;
    }
}
