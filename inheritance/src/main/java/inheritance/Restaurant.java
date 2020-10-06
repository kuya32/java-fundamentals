package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private int stars;
    private String price;
    public ArrayList<Review> restaurantReview = new ArrayList<>();


    public Restaurant(String name, int stars, String price, ArrayList<Review> restaurantReview) {
        this.name = name;
        this.stars = stars;
        this.price = price;
        this.restaurantReview = restaurantReview;
    }

    public String getName() {
        return name;
    }
    public int getStars() {
        return stars;
    }
    public String getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setStars(int stars) {
        this.stars = stars;
    }
    public void setPrice(String price) {
        this.price = price;
    }

    public String toString() {
        return String.format("Restaurant: %s, Number of stars: %d, Price: %s", name,
                stars, price);
    }

    public void addReview(String body, String author, int stars) {
        Review complaint = new Review(body, author, stars);
        this.restaurantReview.add(complaint);
        averageStars();
    }

    public void averageStars() {
        int counter = 0;
        for (Review review : restaurantReview) {
            counter = counter + review.getStars();
        }
//        for (int i = 0; i < restaurantReview.size(); i ++) {
//            counter = counter + restaurantReview.get(i).getStars();
//        }
        this.stars = Math.round(counter/restaurantReview.size());
    }


}

