
public class ListaCircular {

    private NodoCircular actual;

    public void inserir(int valor) {
        NodoCircular novo = new NodoCircular(valor);

        if (actual == null) {
            novo.proximo = actual;
            actual = novo;
        } else {
            novo.proximo = actual.proximo;
            actual.proximo = novo;
        }
    }

    public NodoCircular busca(int ID) {
        if (actual == null) {
            return null;
        }

        NodoCircular temp = actual;
        do {
            if (temp.ID == ID) {
                return temp;
            }
            temp = temp.proximo;
        } while (temp != actual);
        return null;
    }

    public boolean remover(int ID) {
        if (actual == null) {
            return false;
        }

        NodoCircular anterior = actual;
        NodoCircular corrente = actual.proximo;

        if (corrente == actual && actual.ID == ID) {
            actual = null;
            return true;
        }

        do {
            if (corrente.ID == ID) {
                anterior.proximo = corrente.proximo;
                if (corrente == actual) {
                    actual = anterior;
                }
                return true;
            }
            anterior = corrente;
            corrente = corrente.proximo;
        } while (corrente != actual.proximo);
        return false;
    }

    public void imprimir(){
        if(actual == null){
            System.out.println("Lista Vazia");
            return;
        }

        NodoCircular temp = actual;

        do{
            System.out.println("ID: " + temp.ID + " valor: " + temp.valor);
            temp = temp.proximo;
            if(temp == null)
                break;
        }while(temp != actual);
        System.out.println();
    }
}
