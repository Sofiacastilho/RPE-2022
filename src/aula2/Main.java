package aula2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String opcao ="s";

        while(opcao.equalsIgnoreCase ("s")){
            Calculadora calculadora = new Calculadora();
            calculadora.escolherOperacao();

            System.out.println("Continuar?  S - SIM   N - NÃO");
            opcao = scanner.nextLine();

        }
        System.out.println("Programa encerrado");

    }
}
