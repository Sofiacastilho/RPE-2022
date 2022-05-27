package trabalhoFila;

import java.util.Objects;

import static java.util.concurrent.TimeUnit.MILLISECONDS;


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


    /*String[][] map = {
            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
            {"#", "E", "#", " ", " ", "#", " ", " ", " ", "#"},
            {"#", " ", "#", " ", "#", "#", "#", " ", "#", "#"},
            {"#", " ", "#", " ", "#", "#", "#", " ", "#", "#"},
            {"#", " ", "#", " ", "#", "#", "#", " ", "#", "#"},
            {"#", " ", "#", " ", " ", " ", "#", "#", "#", "#"},
            {"#", " ", " ", " ", "#", " ", " ", " ", "S", "#"},
            {"#", " ", "#", "#", "#", " ", "#", " ", "#", "#"},
            {"#", " ", "#", "#", "#", " ", "#", " ", "#", "#"},
            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"}

    };*/


    public void esquerda (){
        linha = linha -1;
        filaLinha.add(linha);
        filaColuna.add(coluna);
        //map[coluna][linha] = "-"; //eu nao entendi pq tem que ser assim, mas se eu coloco [linha][coluna] ele vai ao contrario ????
    }

    public void baixo (){
        coluna = coluna + 1;
        filaLinha.add(linha);
        filaColuna.add(coluna);
        //map[coluna][linha] = "-";
    }

    public void direita () {
        linha = linha + 1;
        filaLinha.add(linha);
        filaColuna.add(coluna);
       // map[coluna][linha] = "-";
    }

    public void cima(){
       coluna = coluna - 1;
       filaLinha.add(linha);
       filaColuna.add(coluna);
        //map[coluna][linha] = "-";
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


    public void verificaCaminho() throws InterruptedException {
        while (!filaColuna.isEmpty() && !filaLinha.isEmpty()){


            System.out.println(filaLinha.toString());
            System.out.println(filaColuna.toString());
            int baseLinha = filaLinha.remove();
            int baseColuna = filaColuna.remove();


            MILLISECONDS.sleep(500 );

            if(filaColuna.isEmpty() && Objects.equals(map[coluna][linha], "S")){
                System.out.println("Parabéns, você encontrou a saída");

            }else if (filaColuna.isEmpty()){
                System.out.println("Não encontrou a saída :(");
            }

            map[baseColuna][baseLinha] = "-";

            printLabirinto();
        }




    }



    public void printLabirinto (){
        for (String[] strings : map) {
            for (int y = 0; y < map.length; y++) {
                System.out.print(strings[y] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");

    }
}
