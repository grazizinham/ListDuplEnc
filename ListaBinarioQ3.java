  public class ListaBinarioQ3 {
    private NoQ3 inicio;
    private NoQ3 fim;
    private int tamanho;

    public ListaBinarioQ3() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }
    public void adicionarBit(int bit) {
        NoQ3 novoNo = new NoQ3(bit);
        
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
        tamanho++;
    }
    public long converterParaDecimal() {
        if (inicio == null) {
            return 0;
        }
        return converterRecursivo(inicio, tamanho - 1);
    }
    private long converterRecursivo(NoQ3 atual, int expoente) {
        if (atual == null) {
            return 0;
        }
        long valorAtual = (long)atual.dado * (long)Math.pow(2, expoente);
        long resultadoRestante = converterRecursivo(atual.proximo, expoente - 1);
        return valorAtual + resultadoRestante;
    }
}