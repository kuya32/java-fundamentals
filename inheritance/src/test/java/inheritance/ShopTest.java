package inheritance;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    public ArrayList<Review> allReviews = new ArrayList<>();

    @Test public void testToStringShop() {
        Shop gucci = new Shop("Gucci", 4, "$$$", allReviews, "High price and high quality " +
                "clothing");
        String expected = "Shop: Gucci, Description: High price and high quality clothing, Price:" +
                " $$$";
        assertEquals(expected, gucci.toString());
    }

    @Test public void testAddReviewShop() {
        Shop lululemon = new Shop("Lululemon", 5, "$", allReviews, "Sells active wear");
        lululemon.addReview("This place is heaven!", "Marchael", 5);
        assertEquals(1, lululemon.allReviews.size());
        lululemon.addReview("The shirt I bought ripped, terrible quality.", "Michael", 2);
        assertEquals(2, lululemon.allReviews.size());
        lululemon.addReview("I love their yoga pants!", "Mishu", 5);
        assertEquals(3, lululemon.allReviews.size());
        assertEquals("Review: This place is heaven!, Author: Marchael, Number of stars: 5",
                lululemon.allReviews.get(0).toString());
        assertEquals("Review: The shirt I bought ripped, terrible quality., Author: Michael, Number " +
                        "of stars: 2",
                lululemon.allReviews.get(1).toString());
        assertEquals("Review: I love their yoga pants!, Author: Mishu, Number of stars: 5",
                lululemon.allReviews.get(2).toString());
    }
}
