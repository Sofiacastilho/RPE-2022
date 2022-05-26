package trabalhoFila;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Labirinto labirinto = new Labirinto();
        Scanner scanner = new Scanner(System.in);

        int comandosEmpilhados = 0;
        String comando;
        boolean fim = false;

        System.out.println("Deseja iniciar? S - sim // N - não");
        comando = scanner.nextLine().toUpperCase(Locale.ROOT);

        if (comando.equals("S")) {

            labirinto.printLabirinto();

            System.out.println("Nesse labirinto, você digitará os comandos, e somente ao final verá se chegou  na saída!\n" +
                    "Quando estiver certo de que chegou ao final, digite 'FIM' e o caminho será verificado.\n" +
                    "Se quiser reiniciar, digite um 'RESET' e o caminho será resetado, boa sorte!\n" +
                    "-----------------------------------");

            labirinto.encontrarEntrada();

            while (!fim) {

                System.out.println("E - esquerda \n" +
                        "D - direita \n" +
                        "C - cima\n" +
                        "B - baixo");
                System.out.println("Comandos empilhados: " + comandosEmpilhados++);
                System.out.println("Para qual lado vai andar?");
                //System.out.println(labirinto.filaLinha.toString());
                //System.out.println(labirinto.filaColuna.toString());

                comando = scanner.nextLine().toUpperCase(Locale.ROOT);


                if (comando.equals("E")) {
                    labirinto.esquerda();

                } else if (comando.equals("D")) {
                    labirinto.direita();

                } else if (comando.equals("C")) {
                    labirinto.cima();

                } else if (comando.equals("B")) {
                    labirinto.baixo();

                }else if (comando.equalsIgnoreCase("RESET")) {
                    labirinto.filaColuna.clear();
                    labirinto.filaLinha.clear();
                    comandosEmpilhados = 0;

                } else if (comando.equalsIgnoreCase("FIM")) {
                    fim = true;

                }else {
                    System.out.println("Digite uma posição válida");
                }

            }
            labirinto.printLabirinto();

        }
        System.exit(0);
    }

}
