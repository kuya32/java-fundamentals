package inheritance;

public class Shop {
    private String name;
    private String description;
    private String price;

    public Shop(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String toString() {
        return String.format("Shop: %s, Description: %s, Price: %s", name, description, price);
    }
}
