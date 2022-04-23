package trabalhoLabirinto;

public class PilhaLinha {

    private Object[] pilhaLinha;
    private int posicacaoPilhaColuna;

    public PilhaLinha() {
        this.posicacaoPilhaColuna = -1;
// indica que esta nula, vazia, pois posição um indica que contém informação
        this.pilhaLinha = new Object[1000];
// criando uma pilha com 1000 posições
    }

    public boolean isEmpty() {
        //isEmpty
        if (this.posicacaoPilhaColuna == -1) {
            return true;
        }
        return false;
    }

    public int getSize() {
        //is
        if (this.isEmpty()) {
            return 0;
        }
        return this.posicacaoPilhaColuna + 1;
    }

    public Object top() {
        //top
        if (this.isEmpty()) {
            return null;
        }
        return this.pilhaLinha[this.posicacaoPilhaColuna];
    }

    public Object pop() {
        //desempilha
        if (isEmpty()) {
            return null;
        }
        return this.pilhaLinha[this.posicacaoPilhaColuna--];
    }

    public void push(Object valor) {
        // push
        if (this.posicacaoPilhaColuna < this.pilhaLinha.length - 1) {
            this.pilhaLinha[++posicacaoPilhaColuna] = valor;
        }
    }




    /*public static void main(String args[]) {
        Pilha p = new Pilha();
        p.empilhar("Portuguesa ");
        p.empilhar("Frango com catupiry ");
        p.empilhar("Calabresa ");
        p.empilhar("Quatro queijos ");
        p.empilhar(10);
        while (p.pilhaVazia() == false) {
            System.out.println(p.desempilhar());
        }
    }*/
}
