package inheritance;

public class Review {
    private String body;
    private String author;
    private int stars;

//    public Review(String name, int stars, int price) {
//        super(name, stars, price);
//    }

    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public String toString() {
//        String result = "Restaurant: " + this.getName() + ", Review: " + this.body + ", Author: " + this.author + ", Number of stars: " + this.stars;
        return String.format("Review: %s, Author: %s, Number of stars: %d", body, author, stars);

//        return result;
    }
}
