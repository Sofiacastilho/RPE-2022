package aula2;

import java.util.Scanner;

public class Calculadora {
    Scanner scanner = new Scanner(System.in);


    private int firstNumber;
    private int secondNumber;
    private String operacao;

    public Calculadora() {
        System.out.println("Primeiro valor: ");
        this.firstNumber = scanner.nextInt();

        System.out.println("Segundo valor: ");
        this.secondNumber = scanner.nextInt();
    }

    public void escolherOperacao(){
        System.out.println("Qual a operação? (+, -, x, /)");
        operacao = scanner.next();
        if (operacao.contains("+")){
            soma();
        } else if (operacao.contains("-")){
            subtracao();
        } else if (operacao.contains("x")){
            multiplicacao();
        } else if (operacao.contains("/")){
            divisao();
        } else {
            System.out.println("Digite uma operação válida.");
        }

    }

    public void soma (){
        int resultSoma = firstNumber + secondNumber;
        System.out.println("Resultado da soma: " + resultSoma);
    }

    public void subtracao (){
        int resultSubtracao = firstNumber - secondNumber;
        System.out.println("Resultado da subtração: " + resultSubtracao);
    }

    public void multiplicacao (){
        int resultMultiplicacao = firstNumber * secondNumber;
        System.out.println("Resultado da multiplicação: " + resultMultiplicacao);
    }

    public void divisao (){
        int resultDivisao = firstNumber / secondNumber;
        System.out.println("Resultado da divisão: " + resultDivisao);
    }

}
