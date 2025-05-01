public class ListaBidimensionalDupla {

    private class Nodo {
        int valor;
        Nodo direita;
        Nodo esquerda;
        Nodo baixo;

        Nodo(int valor) {
            this.valor = valor;
        }
    }

    private Nodo inicio;
    private final int linhas;
    private final int colunas;

    public ListaBidimensionalDupla(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;

        if (linhas <= 0 || colunas <= 0) {
            return;
        }

        // Vetor para armazenar o primeiro nó de cada linha
        Nodo[] linhaSuperior = new Nodo[colunas];

        // Cria a primeira linha
        Nodo atual = new Nodo(0);
        inicio = atual;
        linhaSuperior[0] = atual;

        for (int j = 1; j < colunas; j++) {
            Nodo novo = new Nodo(0);
            atual.direita = novo;
            novo.esquerda = atual;
            atual = novo;
            linhaSuperior[j] = atual;
        }

        // Cria as demais linhas
        Nodo linhaAcima;
        for (int i = 1; i < linhas; i++) {
            atual = new Nodo(0);
            linhaAcima = linhaSuperior[0];
            linhaSuperior[0].baixo = atual;
            linhaSuperior[0] = atual;

            Nodo anterior = atual;

            for (int j = 1; j < colunas; j++) {
                Nodo novo = new Nodo(0);
                anterior.direita = novo;
                novo.esquerda = anterior;
                anterior = novo;

                linhaAcima = linhaSuperior[j];
                linhaAcima.baixo = novo;
                linhaSuperior[j] = novo;
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
