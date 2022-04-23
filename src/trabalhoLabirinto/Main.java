package trabalhoLabirinto;

public class Main {

    public static void main(String[] args) {
        Labirinto labirinto = new Labirinto();
        Acoes acao = new Acoes();
        acao.baixo();
        System.out.println();
        acao.esquerda();
        System.out.println();
        acao.esquerda();
        System.out.println(acao.pilhaX+", "+ acao.pilhaY);
        acao.esquerda();
        System.out.println();
        acao.esquerda();
        //System.out.println(acao.coordenadas);







        labirinto.printLabirinto();
    }

}
