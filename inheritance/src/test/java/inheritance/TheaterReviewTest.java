package inheritance;

import org.junit.Assert;
import org.junit.Test;

public class TheaterReviewTest {
    @Test
    public void testTheaterReviewToString() {
        Theater chairs = new Theater("Northgate");
        chairs.addMovie("Ghostbusters");
        TheaterReview critic = new TheaterReview("Theater was messy", "Marchael", 1,
                "Ghostbusters");
        System.out.println(critic.toString());
        Assert.assertEquals("Theater Review: \nLocation: Northgate\nAuthor: Marchael\nStar " +
                "Rating: 1\nMovie: [Ghostbusters]\nBody: Theater was messy", critic.toString());
    }
}
