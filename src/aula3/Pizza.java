package aula3;

public class Pizza extends Dish{
    private String sauce;
    private String filling;
    private String edge;

    public Pizza(String sauce, String filling, String edge, String name, float price, String expirationDate, float weight) {
        super(name, expirationDate, price,  weight);
        this.sauce = sauce;
        this.filling = filling;
        this.edge = edge;
    }

    public String getSauce() {
        return sauce;
    }

    public String getFilling() {
        return filling;
    }

    public String getEdge() {
        return edge;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public void setEdge(String edge) {
        this.edge = edge;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "sauce='" + sauce + '\'' +
                ", filling='" + filling + '\'' +
                ", edge='" + edge + '\'' +
                '}';
    }
}


