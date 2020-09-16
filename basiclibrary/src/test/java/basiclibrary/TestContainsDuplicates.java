package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestContainsDuplicates {
    @Test public void testContainDuplicates(){
        ContainsDuplicates contDupe = new ContainsDuplicates();
        int[] inputFalseArray = {3, 32, 323, 3232, 333, 34, 32};
        int[] inputTrueArray = {3, 32, 322, 3222, 332, 23, 2};
        assertTrue(contDupe.containsDuplicates(inputFalseArray));
        assertFalse(contDupe.containsDuplicates(inputTrueArray));
    }

}
