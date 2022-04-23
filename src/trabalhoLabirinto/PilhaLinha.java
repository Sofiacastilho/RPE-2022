package trabalhoLabirinto;

public class PilhaLinha {

    private Object[] pilhaLinha;
    private int posicacaoPilhaColuna;

    public PilhaLinha() {
        this.posicacaoPilhaColuna = -1;
        this.pilhaLinha = new Object[100];
    }

    public boolean isEmpty() {
        if (this.posicacaoPilhaColuna == -1) {
            return true;
        }
        return false;
    }

    public int getSize() {
        if (this.isEmpty()) {
            return 0;
        }
        return this.posicacaoPilhaColuna + 1;
    }

    public Object top() {
        if (this.isEmpty()) {
            return null;
        }
        return this.pilhaLinha[this.posicacaoPilhaColuna];
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        return this.pilhaLinha[this.posicacaoPilhaColuna--];
    }

    public void push(Object valor) {
        if (this.posicacaoPilhaColuna < this.pilhaLinha.length - 1) {
            this.pilhaLinha[++posicacaoPilhaColuna] = valor;
        }
    }



}
