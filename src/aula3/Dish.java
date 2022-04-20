package aula3;

public class Dish {
    private String name;
    private String expirationDate;
    private float price;
    private float weight;

    public Dish() {
    }

    public Dish(String name, String expirationDate, float price, float weight) {
        this.name = name;
        this.expirationDate = expirationDate;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", date='" + expirationDate + '\'' +
                ", weight=" + weight +
                '}';
    }
}
