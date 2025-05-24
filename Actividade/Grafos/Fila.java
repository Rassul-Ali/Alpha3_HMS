public class Fila {
    private No frente;
    private No tras;
    
    public Fila() {
        frente = tras = null;
    }
    
    public void enfileirar(int valor) {
        No novoNo = new No(valor);
        if (tras == null) {
            frente = tras = novoNo;
        } else {
            tras.proximo = novoNo;
            tras = novoNo;
        }
    }
    
    public int desenfileirar() {
        if (frente == null) {
            throw new RuntimeException("Fila vazia");
        }
        int valor = frente.valor;
        frente = frente.proximo;
        if (frente == null) {
            tras = null;
        }
        return valor;
    }
    
    public boolean estaVazia() {
        return frente == null;
    }
}