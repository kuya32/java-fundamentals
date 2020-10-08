package inheritance;

public class TheaterReview extends Review{
    public String movie;

    public static void main(String[] args) {
        TheaterReview popcorn = new TheaterReview("body", "Marchael", 5, "Harry Potter");
        System.out.println(popcorn);
    }

    public TheaterReview(String body, String author, int stars, String movie) {
        super(body, author, stars);
        this.movie = movie;
    }

    public String toString() {

        return "Theater Review: " +
                "\nLocation: " + Theater.name +
                "\nAuthor: " + this.getAuthor() +
                "\nStar Rating: " + this.getStars() +
                "\nMovie: " + Theater.getMovieList() +
                "\nBody: " + this.getBody();

    }
}
