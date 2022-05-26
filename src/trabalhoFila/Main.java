package trabalhoFila;

import java.util.Locale;
import java.util.Scanner;
import static java.util.concurrent.TimeUnit.MILLISECONDS;



public class Main {

    public static void main(String[] args) throws InterruptedException {
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
                    "Se quiser reiniciar, digite  'RESET' e o caminho será resetado, boa sorte!\n" +
                    "-----------------------------------");

            MILLISECONDS.sleep(3000 );

            labirinto.encontrarEntrada();

            while (!fim) {

                System.out.println("E - esquerda \n" +
                        "D - direita \n" +
                        "C - cima\n" +
                        "B - baixo");
                System.out.println("Comandos empilhados: " + comandosEmpilhados++);
                System.out.println("Digite seu comando: ");


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
                    labirinto.encontrarEntrada();
                    comandosEmpilhados = 0;

                } else if (comando.equalsIgnoreCase("FIM")) {
                    fim = true;

                }else {
                    System.out.println("Digite uma posição válida");
                }

            }

            labirinto.verificaCaminho();

        }
        System.exit(0);
    }

}
