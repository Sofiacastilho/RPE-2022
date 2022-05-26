package trabalhoLabirintoTentativaDeResolucao;

public class PilhaOndeEstava {

    private int[] pilhaOndeEstava;
    private int posicaoOndeEstava;

    public PilhaOndeEstava() {
        this.posicaoOndeEstava = -1;
        this.pilhaOndeEstava = new int[100];
    }

    public boolean isEmpty() {
        if (this.posicaoOndeEstava == -1) {
            return true;
        }
        return false;
    }

    public int getSize() {
        if (this.isEmpty()) {
            return 0;
        }
        return this.posicaoOndeEstava + 1;
    }

    public int top() {
        if (this.isEmpty()) {
            return -1;
        }
        return this.pilhaOndeEstava[this.posicaoOndeEstava];
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        return this.pilhaOndeEstava[this.posicaoOndeEstava--];
    }

    public void push(int valor) {
        if (this.posicaoOndeEstava < this.pilhaOndeEstava.length - 1) {
            this.pilhaOndeEstava[++posicaoOndeEstava] = valor;
        }
    }

    @Override
    public String toString() {
        String out = "[";
        if(getSize() > 0) {
            out += this.pilhaOndeEstava[0];
        }
        out += "]";
        return out;
    }


}
