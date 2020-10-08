package inheritance;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public class Shop extends Restaurant {
    private String description;
    public ArrayList<Review> allReviews = new ArrayList<>();

    public Shop(String name, int star, String price, ArrayList<Review> restaurantReview, String description) {
        super(name, star, price, restaurantReview);
        this.description = description;
    }

    public void addReview(String body, String author, int stars) {
        Review complaint = new Review(body, author, stars);
        this.allReviews.add(complaint);
    }

    public String toString() {
        return String.format("Shop: %s, Description: %s, Price: %s", getName(), description, getPrice());
    }
}
