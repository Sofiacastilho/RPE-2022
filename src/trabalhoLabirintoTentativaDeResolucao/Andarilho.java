package trabalhoLabirintoTentativaDeResolucao;

import java.util.Objects;

public class Andarilho {
    int linhaAtual;
    int colunaAtual;

    Labirinto mapa = new Labirinto();

    public void encontrarEntrada() {
        for (int l = 0; l < mapa.map.length; l++){
            for (int c = 0; c < mapa.map[l].length; c++){
                if (Objects.equals(mapa.map[l][c], "E")){
                    linhaAtual = l;
                    colunaAtual = c;
                }
            }
        }
    }

    public Andarilho() {
        encontrarEntrada();
    }
}
