package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    @Test public void testToStringRestaurant() {
        Restaurant oliveGarden = new Restaurant("Olive Garden", 3, 15);
        String expected = "Restaurant: Olive Garden, Number of stars: 3, Price: 15";
        assertEquals(expected, oliveGarden.toString());
    }
}
