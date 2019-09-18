package code401challenges;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class ArrayShiftTest {
   //empty array
    @Test
    public void testInsertShiftArray_emptyArr() {
        assertEquals(
                "This array is empty",
                "[6]",
                Arrays.toString(ArrayShift.insertShiftArray(new int[]{}, 6))
        );
    }

    @Test
    public void testInsertShiftArray_correct() {
        assertEquals(
                "This array is correct",
                "[3, 9, 4, 19, 8]",
                Arrays.toString(ArrayShift.insertShiftArray(new int[]{3, 9, 19, 8}, 4))
        );
    }

    @Test
    public void testInsertShiftArray_oddArray() {

    }
}