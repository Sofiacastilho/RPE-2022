package trabalhoLabirinto;

public class Acoes extends Labirinto{
    //StaticaStack caminho = new StaticaStack(64);
    PilhaLinha pilhaX = new PilhaLinha();
    PilhaColuna pilhaY = new PilhaColuna();
   // Labirinto labirinto = new Labirinto();

    public void validaMovimento (String[][] labirinto, String parede) {
        for (int i = 0; i < labirinto.length; ++i) {
            if (labirinto[i].equals(parede)) {
                //nao anda
            }else {
                //anda
            }
        }

    }



    public void esquerda (){
        setCoordX(getCoordX() - 1);
        pilhaX.push(getCoordX());
        pilhaY.push(getCoordY());

    }

    public void baixo (){
        setCoordY(getCoordY() + 1);
        pilhaX.push(getCoordX());
        pilhaY.push(getCoordY());

    }

    public void direita (){
        setCoordX(getCoordX() + 1);
        pilhaX.push(getCoordX());
        pilhaY.push(getCoordY());
    }

    public void cima (){
        setCoordY(getCoordY() - 1);
        pilhaX.push(getCoordX());
        pilhaY.push(getCoordY());
    }

    public void voltar (){
        pilhaX.pop();
        pilhaY.pop();

        getCoordX();
        getCoordY();

    }

    @Override
    public String toString() {
        return this.pilhaX.top()+"";
    }


}
