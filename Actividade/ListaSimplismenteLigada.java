
public class ListaSimplismenteLigada {

    Nodo1 primeiro;

    public ListaSimplismenteLigada() {
        primeiro = null;
    }

    public void inserirPrimeiro(int valor) {
        Nodo1 novo = new Nodo1(valor);
        novo.proximo = primeiro;
        primeiro = novo;
    }

    public void inserir(int valor){
        Nodo1 novo = new Nodo1(valor);
        Nodo1 anterior = null;
        Nodo1 atual = primeiro;

        while(atual != null && valor > atual.valor){
            anterior = atual;
            atual = atual.proximo;
        }

        if(anterior == null)
            primeiro = novo;
        else
            anterior.proximo = novo;
        novo.proximo = atual;
    }

    public void inserirSegundo(int valor) {
        if (primeiro != null) {
            Nodo1 novo = new Nodo1(valor);
            novo.proximo = primeiro.proximo;
            primeiro.proximo = novo;
        } else {
            System.err.println("Primeira Posicao Vazia");
        }
    }

    public boolean remover1(int id) {
        Nodo1 atual = primeiro;

        while (atual != null) {
            if (atual.id == id) {
                primeiro = atual.proximo;
                return true;
            } else if (atual.proximo != null) {
                if (atual.proximo.id == id) {
                    atual.proximo = atual.proximo.proximo;
                    return true;
                }
            }
            atual = atual.proximo;
        }

        return false;
    }

    public boolean remover2(int id) {
        Nodo1 atual = primeiro;
        Nodo1 anterior = primeiro;

        while (atual.id != id) {

            if (atual.proximo == null) {
                return false; 
            }else {
                anterior = atual;
            }

            atual = atual.proximo;
        }
        if (atual == primeiro) {
            primeiro = atual.proximo; 
        }else {
            anterior.proximo = atual.proximo;
        }
        return true;
    }

    public int removerUltimo2() {
        Nodo1 atual = primeiro;
        Nodo1 anterior = primeiro;
        int temp;
        while (atual.proximo != null) {
            anterior = atual;
            atual = atual.proximo;
        }
        if (atual == primeiro) {
            temp = primeiro.valor;
            primeiro = null;
        } else {
            temp = anterior.proximo.valor;
            anterior.proximo = null;
        }

        return temp;
    }

    public Nodo1 retornaUltimo() {
        Nodo1 atual = primeiro;
        Nodo1 anterior = primeiro;
        while (atual.proximo != null) {
            anterior = atual;
            atual = atual.proximo;
        }
        if (atual == primeiro) {
            return primeiro;
        }
        return anterior.proximo;
    }

    public int removerPrimerio() {
        int temp = primeiro.valor;
        primeiro = primeiro.proximo;
        return temp;
    }

    public Nodo1 busca(int id) {
        Nodo1 atual = primeiro;

        while (atual.id != id) {
            if (atual.id == id) {
                return atual;
            }
            atual = atual.proximo;
        }

        return atual;
    }

    public void MostrarLista() {
        Nodo1 atual = primeiro;

        while (atual != null) {
            System.out.println("O id e: " + atual.id + " e  O valor e: " + atual.valor);
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void inserirUltimo(int valor) {
        Nodo1 novo = new Nodo1(valor);
        if (primeiro == null) {
            primeiro = novo;
        } else {
            Nodo1 atual = primeiro;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
    }

    public int tamanho() {
        int count = 0;
        Nodo1 atual = primeiro;
        while (atual != null) {
            count++;
            atual = atual.proximo;
        }
        return count;
    }

    public int removerPrimeiro() {
        if (primeiro == null) {
            System.out.println("Lista vazia");
            return -1;
        }
        int valorRemovido = primeiro.valor;
        primeiro = primeiro.proximo;
        return valorRemovido;
    }

    public Nodo1 retornarPrimeiro(){
        return primeiro;
    }
}
