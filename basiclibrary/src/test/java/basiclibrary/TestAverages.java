package basiclibrary;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestAverages {
    @Test public void testAveragesOfArray(){
        Averages averages = new Averages();
        assertArrayEquals(new int[]{1, 2, 3}, averages.lowestOfAverages(new int[][]{{1, 2, 3}, {10, 20, 30}}));
    }
}
