package trabalhoLabirinto;

public class Labirinto {


    private int CoordX = 1;
    private int CoordY = 1;
    private String parede = "#";

    //caminho livre = .
    //E = entrada,  S = saida
    //caminho passado V
    //start (1,1) end (1,8)


    private String labirinto [][]  = {
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


    public void printLabirinto (){
        for (int x = 0; x < labirinto.length; x++){
            for (int y = 0; y < labirinto.length; y++){
                System.out.print(labirinto[x][y] + " ");
            }
            System.out.println();
        }
    }

    public int getCoordX() {
        return CoordX;
    }

    public void setCoordX(int coordX) {
        CoordX = coordX;
    }

    public int getCoordY() {
        return CoordY;
    }

    public void setCoordY(int coordY) {
        CoordY = coordY;
    }

    public String[][] getLabirinto() {
        return labirinto;
    }

    public void setLabirinto(String[][] labirinto) {
        this.labirinto = labirinto;
    }

    public String getParede() {
        return parede;
    }
}
