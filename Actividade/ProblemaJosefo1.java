
public class ProblemaJosefo1 {

    public static void main(String[] args) {
        int totalPessoas = 20;
        int posicaoJosefo = 7;

        for (int n = 1; n <= totalPessoas; n++) {
            int sobrevivente = josefo(totalPessoas, n);

            if (sobrevivente == posicaoJosefo) {
                System.out.println("Numero para Passo(" + n + ")");
                break;
            }
        }
    }

    public static int josefo(int m, int n) {
        if (m == 1) {
            return 1;
        } else {
            return (josefo(m - 1, n) + n - 1) % m + 1;
        }
    }
}
