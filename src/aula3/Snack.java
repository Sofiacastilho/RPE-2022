package aula3;

public class Snack extends Dish{
    private String filling;
    private String dough;

    public Snack(String filling, String dough, String name, float price, String expirationDate, float weight) {
        super(name, expirationDate, price,  weight);
        this.filling = filling;
        this.dough = dough;
    }

    public String getFilling() {
        return filling;
    }

    public String getDough() {
        return dough;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    @Override
    public String toString() {
        return "Chips{" +
                "filling='" + filling + '\'' +
                ", dough='" + dough + '\'' +
                '}';
    }
}