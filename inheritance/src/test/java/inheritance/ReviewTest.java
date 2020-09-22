package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {
    @Test public void testToStringReview() {
        String complaint = "I asked for no ice and there was a single ice cube in my water";
        Review karen = new Review(complaint, "Karen", 1);
        String expected = "Review: I asked for no ice and there was a single ice cube in my water, Author: Karen, Number of stars: 1";
        assertEquals(expected, karen.toString());
    }
}
