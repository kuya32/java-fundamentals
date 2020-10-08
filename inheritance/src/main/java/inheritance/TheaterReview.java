package inheritance;

public class TheaterReview extends Review{
    public String movies;

    public TheaterReview(String body, String author, int stars, String movies) {
        super(body, author, stars);
        this.movies = movies;
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
