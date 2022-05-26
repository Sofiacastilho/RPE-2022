package trabalhoLabirintoTentativaDeResolucao;

public class PilhaColuna {

    public Object[] pilhaColuna;
    public int posicaoPilhaColuna;

    public PilhaColuna() {
        this.posicaoPilhaColuna = -1;
        this.pilhaColuna = new Object[100];
    }

    public boolean isEmpty() {
        if (this.posicaoPilhaColuna == -1) {
            return true;
        }
        return false;
    }

    public int getSize() {
        if (this.isEmpty()) {
            return 0;
        }
        return this.posicaoPilhaColuna + 1;
    }

    public Object top() {
        if (this.isEmpty()) {
            return null;
        }
        return this.pilhaColuna[this.posicaoPilhaColuna];
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        return this.pilhaColuna[this.posicaoPilhaColuna--];
    }

    public void push(Object valor) {
        if (this.posicaoPilhaColuna < this.pilhaColuna.length - 1) {
            this.pilhaColuna[++posicaoPilhaColuna] = valor;
        }
    }

    @Override
    public String toString() {
        String out = "[";
        if(getSize() > 0) {
            out += this.pilhaColuna[0];
        }

        out += "]";
        return out;
    }

}