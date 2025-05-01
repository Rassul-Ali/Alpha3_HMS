
public class ListaBidimensionalDupla1 {

    private class Nodo {

        int valor;
        Nodo direita;
        Nodo esquerda;
        Nodo baixo;
        Nodo cima;

        Nodo(int valor) {
            this.valor = valor;
        }
    }

    private Nodo inicio;
    private final int linhas;
    private final int colunas;

    public ListaBidimensionalDupla1(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;

        if (linhas <= 0 || colunas <= 0) {
            return;
        }

        inicio = new Nodo(0);
        Nodo atualLinha = inicio;
        Nodo atualColuna = inicio;

        for (int j = 1; j < colunas; j++) {
            Nodo novo = new Nodo(0);
            atualLinha.direita = novo;
            novo.esquerda = atualLinha;
            atualLinha = novo;
        }

        // Cria as demais linhas
        for (int i = 1; i < linhas; i++) {
            Nodo novaLinha = new Nodo(0);
            atualColuna.baixo = novaLinha;
            novaLinha.cima = atualColuna;
            atualColuna = atualColuna.direita;
            atualLinha = novaLinha;

            Nodo atualSuperior = atualColuna;
            for (int j = 1; j < colunas; j++) {
                Nodo novo = new Nodo(0);
                atualLinha.direita = novo;
                novo.esquerda = atualLinha;
                atualLinha = novo;

                atualSuperior.baixo = atualLinha;
                atualLinha.cima = atualSuperior;
                atualSuperior = atualSuperior.direita;
            }
        }
    }

    public void setValor(int linha, int coluna, int valor) {
        if (linha < 0 || linha >= linhas || coluna < 0 || coluna >= colunas) {
            return;
        }

        Nodo atual = inicio;
        for (int i = 0; i < linha; i++) {
            atual = atual.baixo;
        }

        for (int j = 0; j < coluna; j++) {
            atual = atual.direita;
        }

        atual.valor = valor;
    }

    public int getValor(int linha, int coluna) {
        if (linha < 0 || linha >= linhas || coluna < 0 || coluna >= colunas) {
            return 0;
        }

        Nodo atual = inicio;
        for (int i = 0; i < linha; i++) {
            atual = atual.baixo;
        }

        for (int j = 0; j < coluna; j++) {
            atual = atual.direita;
        }

        return atual.valor;
    }
}
