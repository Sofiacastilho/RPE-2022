package aula3;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    private String clientName;
    private Float serviceTax;
    private ArrayList<Dish> consumed_Items;

    public Order() {
        clientName = "";
        consumed_Items = new ArrayList<>();
        serviceTax = 0.1f;
    }

    public void addItem(Dish dish) {
        consumed_Items.add(dish);
    }

    private float calculateTotalItemsValue() {
        float sum = 0f;
        for (Dish dish: consumed_Items) {
            sum += dish.getPrice();
        }

        return sum;
    }

    public float calculateServiceFee() {
        return calculateTotalItemsValue() * serviceTax;
    }

    public float calculateChange() {
        float change = 0f;
        Scanner input = new Scanner(System.in);
        System.out.print("Recebido em Dinheiro: ");
        change = input.nextFloat();

        float total = (calculateTotalItemsValue() + calculateServiceFee());
        return (change - total);
    }

    public void printInvoice() {
        float total = calculateTotalItemsValue() + calculateServiceFee();

        System.out.println("\n------------CUPOM FISCAL------------\n");
        System.out.println("----------ITENS CONSUMIDOS----------");
        for (Dish dish: consumed_Items) {
            System.out.printf("%-25s R$ %7.2f\n", dish.getName(), dish.getPrice());
        }

        System.out.printf("\n%-25s R$ %7.2f\n", "Taxa de Serviço: ", calculateServiceFee());

        System.out.println("------------------------------------");
        System.out.printf("%-25s R$ %7.2f\n", "TOTAL: ", total);
        System.out.printf("%-25s R$ %7.2f\n\n", "Troco: ", calculateChange());
        System.out.println("------------------------------------\n");

        System.out.println("Obrigado pela preferência. Volte sempre " + getClientName() + "!\n\n");
    }

    public String getClientName() {
        return clientName;
    }

    public float getServiceFee() {
        return serviceTax;
    }

    public ArrayList<Dish> getConsumedItems() {
        return consumed_Items;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "clientName='" + clientName + '\'' +
                ", serviceTax=" + serviceTax +
                ", consumedItems=" + consumed_Items +
                '}';
    }
}


