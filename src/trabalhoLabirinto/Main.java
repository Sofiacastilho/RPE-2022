package trabalhoLabirinto;

public class Main {

    public static void main(String[] args) {
        Labirinto labirinto = new Labirinto();

        Acoes acao = new Acoes();
        acao.cima();
        acao.esquerda();
        acao.baixo();
        acao.direita();


        labirinto.printLabirinto();
    }

}
