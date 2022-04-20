package aula3;

public class Sandwich extends Dish{
    private String bread;
    private String filling;
    private String sauce;

    public Sandwich(String bread, String filling, String sauce, String name, float price, String expirationDate, float weight) {
        super(name, expirationDate, price,  weight);
        this.bread = bread;
        this.filling = filling;
        this.sauce = sauce;
    }

    public String getBread() {
        return bread;
    }

    public String getFilling() {
        return filling;
    }

    public String getSauce() {
        return sauce;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "bread='" + bread + '\'' +
                ", filling='" + filling + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }
}