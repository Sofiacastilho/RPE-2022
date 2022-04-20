package aula3;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {

    static ArrayList<Dish> availableDishes = new ArrayList<Dish>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        loadMenuItems();

        int option = 0;

        while(true) {
            System.out.println("---------------- BEM VINDO! ----------------\n");
            System.out.println("1. Fazer pedido.");
            System.out.println("2. Sair.\n");
            System.out.print("Digite a opção: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    createOrder();
                    break;
                case 2:
                    System.out.println("\nAGRADECEMOS A PREFERENCIA! VOLTE SEMPRE!");
                    return;
            }
        }
    }

    public static void loadMenuItems() {
        Pizza portuguesa = new Pizza("Portuguesa", "Presunto", "Catupiry","Pizza Portuguesa", 35f, "27/04/2022", 7);
        Pizza quatroQueijos = new Pizza("4 Queijos", "Gorgonzola", "Cheddar", "Pizza 4 Queijos", 40f, "27/04/2022", 8);
        Pizza marguerita = new Pizza("Marguerita", "Manjericão", "Chocolate", "Pizza Marguerita", 30f, "26/04/2022", 5);

        Sandwich paoComOvo = new Sandwich("Francês", "Ovos e Bacon", "Catshup e Mostarda","Pão com Ovo", 12, "25/04/2022", 300);
        Sandwich bagueteDeCarne = new Sandwich("Baguete", "Alcatra e Pimentão", "Cheddar","Baguete de Carne", 25, "26/04/2022", 450);
        Sandwich xBurguer = new Sandwich("Cervejinha", "Hamburguer", "Maionese","X-Burguer", 18, "26/04/2022", 400);

        Snack coxinha = new Snack("Frango", "Mandioca","Coxinha de Frango", 5, "25/04/2022", 100);
        Snack risoles = new Snack("Carne Moída", "Batata","Risoles de Carne", 6, "25/04/2022", 120);
        Snack paoDeBatata = new Snack("Catupiry", "Batata","Pão de Batata" ,10, "13/3/2020", 70);

        availableDishes.add(portuguesa);
        availableDishes.add(quatroQueijos);
        availableDishes.add(marguerita);

        availableDishes.add(paoComOvo);
        availableDishes.add(bagueteDeCarne);
        availableDishes.add(xBurguer);

        availableDishes.add(coxinha);
        availableDishes.add(risoles);
        availableDishes.add(paoDeBatata);
    }

    public static void createOrder() {
        Order order = new Order();
        System.out.print("Nome do cliente: ");
        String name = input.nextLine();
        order.setClientName(name);

        int option = -1;
        while(true) {
            System.out.println("\n----------------- CARDÁPIO -----------------");
            for (int i = 0; i < availableDishes.size(); i++) {
                System.out.println((i + 1) + ". " + availableDishes.get(i).getName());
            }
            System.out.print("\nDigite o número do item para adicionar ou 0 para finalizar o pedido: ");
            option = input.nextInt();

            if(option == 0) {
                System.out.println("Pedido finalizado com sucesso!\n");
                break;
            }
            System.out.println("Item adicionado com sucesso!");
            order.addItem(availableDishes.get(option - 1));
        }

        order.printInvoice();
    }
}