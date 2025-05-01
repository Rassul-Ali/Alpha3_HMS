
public class MatrizSimples {

    private Nodo pNodo;
    private int linhas, colunas;

    public MatrizSimples(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.pNodo = null;

        if (colunas > 0 && linhas > 0) {
            Nodo[] linhasHor = new Nodo[linhas];

            for (int i = 0; i < linhas; i++) {
                Nodo linha = new Nodo(0);
                linhasHor[i] = linha;

                Nodo actual = linha;
                for (int j = 0; j < colunas; j++) {
                    actual.proximo = new Nodo(0);
                    actual = actual.proximo;
                }
            }

            for (int i = 0; i < linhas - 1; i++) {
                Nodo ultimaLinha = linhasHor[i];

                while (ultimaLinha.proximo != null) {
                    ultimaLinha = ultimaLinha.proximo;
                }
                ultimaLinha.proximo = linhasHor[i + 1];
            }
            this.pNodo = linhasHor[0];
        }
    }

    public void set(int linha, int coluna, int valor) {
        if (linha < 0 || linha >= linhas || coluna < 0 || coluna >= colunas) {
            System.out.println("Error nos Indice");
            return;
        }

        Nodo nodo = getNodo(linha, coluna);
        nodo.valor = valor;
    }

    public int get(int linha, int coluna, int valor) {
        if (linha < 0 || linha >= linhas || coluna < 0 || coluna >= colunas) {
            System.out.println("Error nos Indice");
            return -1;
        }

        Nodo nodo = getNodo(linha, coluna);
        return nodo.valor;
    }

    private Nodo getNodo(int linha, int coluna) {
        int posicao = linha * colunas + coluna;
        Nodo actual = pNodo;
        for (int i = 0; i < posicao; i++) {
            actual = actual.proximo;
        }

        return actual;
    }

    public void print() {
        Nodo actual = pNodo;

        for (int i = 0; i < linhas; i++) {
            Nodo actuall = actual;
            for (int j = 0; j < colunas; j++) {
                System.out.print(actual.valor + " ");
                actuall = actuall.proximo;
            }
            System.out.println();

            for (int j = 0; j < colunas; j++) {
                actual = actual.proximo;
            }
        }
    }
}
