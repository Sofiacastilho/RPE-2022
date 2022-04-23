package trabalhoLabirinto;

public class PilhaColuna {

    public Object[] pilhaColuna;
    public int posicaoPilhaColuna;

    public PilhaColuna() {
        this.posicaoPilhaColuna = -1;
// indica que esta nula, vazia, pois posição um indica que contém informação
        this.pilhaColuna = new Object[1000];
// criando uma pilha com 1000 posições
    }

    public boolean pilhaVazia() {
        //isEmpty
        if (this.posicaoPilhaColuna == -1) {
            return true;
        }
        return false;
    }

    public int getSize() {
        //is
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.posicaoPilhaColuna + 1;
    }

    public Object top() {
        //top
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilhaColuna[this.posicaoPilhaColuna];
    }

    public Object pop() {
        //pop
        if (pilhaVazia()) {
            return null;
        }
        return this.pilhaColuna[this.posicaoPilhaColuna--];
    }

    public void push(Object valor) {
        // push
        if (this.posicaoPilhaColuna < this.pilhaColuna.length - 1) {
            this.pilhaColuna[++posicaoPilhaColuna] = valor;
        }
    }

    public static void main(String args[]) {
        PilhaColuna p = new PilhaColuna();
        p.push("Portuguesa ");
        p.push("Frango com catupiry ");
        p.push("Calabresa ");
        p.push("Quatro queijos ");
        p.push(10);
        while (p.pilhaVazia() == false) {
            System.out.println(p.pop());
        }
    }
}