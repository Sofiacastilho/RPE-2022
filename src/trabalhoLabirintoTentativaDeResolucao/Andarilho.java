package trabalhoLabirintoTentativaDeResolucao;

import java.util.Objects;

public class Andarilho {
    int linhaAtual;
    int colunaAtual;

    PilhaColuna pilhaColuna= new PilhaColuna();
    PilhaLinha pilhaLinha= new PilhaLinha();
    PilhaOndeEstava ondeEstava = new PilhaOndeEstava();
    Labirinto mapa = new Labirinto();


    public Andarilho() {
        encontrarEntrada();
    }

    public void encontrarEntrada() {
        for (int l = 0; l < mapa.map.length; l++){
            for (int c = 0; c < mapa.map[l].length; c++){
                if (Objects.equals(mapa.map[l][c], "E")){
                    linhaAtual = l;
                    colunaAtual = c;
                    pilhaLinha.push(linhaAtual);
                    pilhaColuna.push(colunaAtual);
                }
            }
        }
        System.out.println(pilhaLinha.toString());
        System.out.println(pilhaColuna.toString());
    }

    public boolean validaSaida(){
        if (Objects.equals(mapa.map[linhaAtual][colunaAtual], "S")){
            System.out.println("Parabéns, você encontrou a saída");
            return true;
        }
        return false;
    }

    public void anda(){
        while(!validaSaida()){

            if (Objects.equals(mapa.map[linhaAtual + 1][colunaAtual], ".") ){
                direita();
                ondeEstava.push(0);
                mapa.printLabirinto();

            }else if (Objects.equals(mapa.map[linhaAtual][colunaAtual + 1], ".")){
                baixo();
                ondeEstava.push(1);
                mapa.printLabirinto();

            }else if (Objects.equals(mapa.map[linhaAtual - 1][colunaAtual], ".")){
                esquerda();
                ondeEstava.push(2);
                mapa.printLabirinto();


            }else if (Objects.equals(mapa.map[linhaAtual][colunaAtual - 1], ".")){
                cima();
                ondeEstava.push(3);
                mapa.printLabirinto();

            } else {
                switch (ondeEstava.top()) {
                    case 0:
                        pilhaLinha.pop();

                        break;

                    case 1:
                        pilhaColuna.pop();
                        break;

                    case 2:
                        pilhaLinha.pop();

                        break;

                    case 3:
                        pilhaColuna.pop();
                        break;
                }
                ondeEstava.pop();

            }
        }
    }



    public void esquerda (){
        linhaAtual = linhaAtual - 1;
        mapa.map[linhaAtual][colunaAtual] = "*";

        pilhaLinha.push(linhaAtual);
    }

    public void baixo (){
        colunaAtual = colunaAtual + 1;
        mapa.map[linhaAtual][colunaAtual] = "*";

        pilhaColuna.push(colunaAtual);
    }

    public void direita () {
        linhaAtual = linhaAtual + 1;
        mapa.map[linhaAtual][colunaAtual] = "*";

        pilhaLinha.push(linhaAtual);
    }

    public void cima(){
        colunaAtual = colunaAtual - 1;
        mapa.map[linhaAtual][colunaAtual] = "*";

        pilhaColuna.push(colunaAtual);
    }

}
