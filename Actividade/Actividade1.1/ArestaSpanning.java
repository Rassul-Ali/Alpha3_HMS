public class ArestaSpanning implements Comparable<ArestaSpanning> {
    int origem;
    int destino;
    int peso;

    public ArestaSpanning(int origem, int destino, int peso) {
        this.origem = origem;
        this.destino = destino;
        this.peso = peso;
    }

    @Override
    public int compareTo(ArestaSpanning outra) {
        return this.peso - outra.peso;
    }
}
