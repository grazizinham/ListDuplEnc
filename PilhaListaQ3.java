public class PilhaListaQ3 {
    private NoQ3 inicio;
    private NoQ3 fim; 
    private int tamanho;

    public PilhaListaQ3() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void adicionarNoFim(char dado) {
        NoQ3 novoNo = new NoQ3(dado);
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

    public Character desempilha() {
        if (tamanho == 0) {
            return null; 
        }

        char dadoRemovido = fim.dado;

        if (tamanho == 1) {
            inicio = null;
            fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }
        tamanho--;
        return dadoRemovido;
    }

    public char get(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice fora do limite.");
        }
        NoQ3 atual = inicio;
        for (int i = 0; i < indice; i++) {
            atual = atual.proximo;
        }
        return atual.dado;
    }

    public int getTamanho() {
        return tamanho;
    }
}