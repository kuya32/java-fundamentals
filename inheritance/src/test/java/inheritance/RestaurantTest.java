package inheritance;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RestaurantTest {
    public ArrayList<Review> restaurantReview = new ArrayList<>();

    @Test public void testToStringRestaurant() {
        Restaurant oliveGarden = new Restaurant("Olive Garden", 3, "$", restaurantReview);
        String expected = "Restaurant: Olive Garden, Number of stars: 3, Price: $";
        assertEquals(expected, oliveGarden.toString());
    }

    @Test public void testAddReview() {
        Restaurant dicksBurgers = new Restaurant("Dick's Burgers", 5, "$", restaurantReview);
        dicksBurgers.addReview("Their burgers are amazing!", "Marchael", 5);
        assertEquals(1, dicksBurgers.restaurantReview.size());
        dicksBurgers.addReview("Burgers are great, but fries were greasy.", "Michael", 4);
        assertEquals(2, dicksBurgers.restaurantReview.size());
        dicksBurgers.addReview("I love their soggy fries!", "Mishu", 5);
        assertEquals(3, dicksBurgers.restaurantReview.size());
        assertEquals("Review: Their burgers are amazing!, Author: Marchael, Number of stars: 5",
                dicksBurgers.restaurantReview.get(0).toString());
        assertEquals("Review: Burgers are great, but fries were greasy., Author: Michael, Number " +
                        "of stars: 4",
                dicksBurgers.restaurantReview.get(1).toString());
        assertEquals("Review: I love their soggy fries!, Author: Mishu, Number of stars: 5",
                dicksBurgers.restaurantReview.get(2).toString());
    }

    @Test public void testAverageStars() {
        Restaurant dicksBurgers = new Restaurant("Dick's Burgers", 5, "$", restaurantReview);
        dicksBurgers.addReview("Their burgers are amazing!", "Marchael", 5);
        dicksBurgers.addReview("Burgers are great, but fries were greasy.", "Michael", 4);
        dicksBurgers.addReview("I love their soggy fries!", "Mishu", 5);
        assertEquals(4, dicksBurgers.getStars());
        dicksBurgers.addReview("In-n-Out is better...", "Jeff", 1);
        assertEquals(3, dicksBurgers.getStars());
    }
}
