package trabalhoLabirintoTentativaDeResolucao;

public class Acoes extends Labirinto {
    PilhaLinha pilhaX = new PilhaLinha();
    PilhaColuna pilhaY = new PilhaColuna();
    private String parede = "#";

    private boolean anda;


//valida o movimento vendo se tem parede(#),
//(V) caminho ja passado ou (.) caminho livre
//precisa decidir pra onde vai quando todos os caminhos ja foram visitados
    public void validaMovimento () {

    }

   /* public void esquerda (){
        setCoordX(getCoordX() - 1);
        validaMovimento();
        if (anda == true) {
            pilhaX.push(getCoordX());
            pilhaY.push(getCoordY());
        }
    }

    public void baixo (){
        setCoordY(getCoordY() + 1);
        if (anda == true) {
            pilhaX.push(getCoordX());
            pilhaY.push(getCoordY());
        }
    }

    public void direita () {
        setCoordX(getCoordX() + 1);
        if (anda == true) {
            pilhaX.push(getCoordX());
            pilhaY.push(getCoordY());
        }
    }

    public void cima(){
        setCoordY(getCoordY() - 1);
        if (anda == true) {
            pilhaX.push(getCoordX());
            pilhaY.push(getCoordY());
        }
    }

    public void voltar (){
        pilhaX.pop();
        pilhaY.pop();

        getCoordX();
        getCoordY();
    }
*/

}
