package trabalhoFila;

import java.util.Objects;

public class Labirinto {
    private int linha;
    private int coluna;

    FilaLinha filaLinha = new FilaLinha();
    FilaColuna filaColuna = new FilaColuna();

    String [][] map = {
          //{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}
            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"}, //0
            {"#", "E", ".", ".", ".", "#", ".", "#", "S", "#"}, //1
            {"#", "#", "#", "#", ".", "#", ".", "#", ".", "#"}, //2
            {"#", ".", ".", ".", ".", "#", ".", ".", ".", "#"}, //3
            {"#", ".", "#", "#", "#", ".", ".", "#", ".", "#"}, //4
            {"#", ".", ".", ".", "#", ".", "#", ".", ".", "#"}, //5
            {"#", "#", "#", ".", "#", ".", "#", ".", ".", "#"}, //6
            {"#", ".", "#", ".", ".", ".", "#", "#", ".", "#"}, //7
            {"#", ".", ".", ".", "#", ".", ".", ".", "#", "#"}, //8
            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"}  //9
    };


    public void esquerda (){
        linha = linha -1;
        filaLinha.add(linha);
        filaColuna.add(coluna);
        map[coluna][linha] = "-"; //eu nao entendi pq tem que ser assim, mas se eu coloco [linha][coluna] ele vai ao contrario ????
    }

    public void baixo (){
        coluna = coluna + 1;
        filaLinha.add(linha);
        filaColuna.add(coluna);
        map[coluna][linha] = "-";
    }

    public void direita () {
        linha = linha + 1;
        filaLinha.add(linha);
        filaColuna.add(coluna);
        map[coluna][linha] = "-";
    }

    public void cima(){
       coluna = coluna - 1;
       filaLinha.add(linha);
       filaColuna.add(coluna);
        map[coluna][linha] = "-";
    }

    public void encontrarEntrada() {

        for (int l = 0; l < map.length; l++){
            for (int c = 0; c < map[l].length; c++){
                if (Objects.equals(map[l][c], "E")){
                    linha = l;
                    coluna = c;
                    filaLinha.add(linha);
                    filaColuna.add(coluna);
                }
            }
        }
    }


    public boolean saida(){
        if (Objects.equals(map[coluna][linha], "S")){
            System.out.println("Parabéns, você encontrou a saída");
            return true;
        }
        return false;
    }

    public void verificaCaminho(){

        map[coluna][linha] = "-";
    }



    public void printLabirinto (){
        for (int x = 0; x < map.length; x++){
            for (int y = 0; y < map.length; y++){
                System.out.print(map[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");

    }
}
