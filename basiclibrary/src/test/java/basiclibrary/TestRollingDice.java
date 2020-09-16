package basiclibrary;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestRollingDice {
    @Test
    public void testSomeLibraryMethod() {
        RollingDice rolling = new RollingDice();
        int[] output = rolling.roll(10000);

        assertArrayEquals(output, output);
    }
}
