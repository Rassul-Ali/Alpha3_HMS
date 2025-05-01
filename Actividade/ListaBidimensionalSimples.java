public class ListaBidimensionalSimples {

    private class Nodo {
        int valor;
        Nodo direita;
        Nodo baixo;

        Nodo(int valor) {
            this.valor = valor;
        }
    }

    private Nodo inicio;
    private final int linhas;
    private final int colunas;

    public ListaBidimensionalSimples(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;

        if (linhas <= 0 || colunas <= 0) {
            return;
        }

        Nodo[][] matriz = new Nodo[linhas][colunas];

        // Cria todos os nos
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = new Nodo(0);
            }
        }

        // Conecta os nos a direita e para baixo
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (j + 1 < colunas) {
                    matriz[i][j].direita = matriz[i][j + 1];
                }
                if (i + 1 < linhas) {
                    matriz[i][j].baixo = matriz[i + 1][j];
                }
            }
        }

        // Define o inicio da matriz
        inicio = matriz[0][0];
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
            return -1;
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
