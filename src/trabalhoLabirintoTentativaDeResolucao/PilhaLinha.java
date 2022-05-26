package trabalhoLabirintoTentativaDeResolucao;

public class PilhaLinha {

    private Object[] pilhaLinha;
    private int posicaoPilhaLinha;

    public PilhaLinha() {
        this.posicaoPilhaLinha = -1;
        this.pilhaLinha = new Object[100];
    }

    public boolean isEmpty() {
        if (this.posicaoPilhaLinha == -1) {
            return true;
        }
        return false;
    }

    public int getSize() {
        if (this.isEmpty()) {
            return 0;
        }
        return this.posicaoPilhaLinha + 1;
    }

    public Object top() {
        if (this.isEmpty()) {
            return null;
        }
        return this.pilhaLinha[this.posicaoPilhaLinha];
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        return this.pilhaLinha[this.posicaoPilhaLinha--];
    }

    public void push(Object valor) {
        if (this.posicaoPilhaLinha < this.pilhaLinha.length - 1) {
            this.pilhaLinha[++posicaoPilhaLinha] = valor;
        }
    }

    @Override
    public String toString() {
        String out = "[";
        if(getSize() > 0) {
            out += this.pilhaLinha[0];
        }
        out += "]";
        return out;
    }

}
