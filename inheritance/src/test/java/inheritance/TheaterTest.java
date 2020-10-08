package inheritance;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TheaterTest {

    @Test public void testTheaterToString() {
        Theater chairs = new Theater("Northgate");
        chairs.addMovie("Walle");
        chairs.addMovie("Paprika");
        Assert.assertEquals("Theater: Northgate\nMovie List: " + Theater.movieList,
                chairs.toString());
    }

    @Test public void testTheaterAddAndRemove() {
        Theater chairs = new Theater("Northgate");
        chairs.addMovie("Harry Potter");
        Assert.assertEquals("Harry Potter", Theater.movieList.get(0));
        chairs.addMovie("Underworld");
        Assert.assertEquals("Underworld", Theater.movieList.get(1));
        chairs.addMovie("Austin Powers");
        Assert.assertEquals("Austin Powers", Theater.movieList.get(2));
        chairs.removeMovie("Harry Potter");
        chairs.removeMovie("Underworld");
        Assert.assertEquals(1, Theater.getMovieList().size());
        Assert.assertEquals("Austin Powers", Theater.movieList.get(0));
    }
}
