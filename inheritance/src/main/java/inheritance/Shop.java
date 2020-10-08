package inheritance;

import java.util.ArrayList;

public class Shop extends Restaurant {
    private String description;


    public Shop(String name, int star, String price, ArrayList<Review> restaurantReview, String description) {
        super(name, star, price, restaurantReview);
        this.description = description;
    }

    public void addReview(String body, String author, int stars) {
        Review complaint = new Review(body, author, stars);
        this.restaurantReview.add(complaint);
        averageStars();
    }

    public String toString() {
        return String.format("Shop: %s, Description: %s, Price: %s", getName(), description, getPrice());
    }
}
