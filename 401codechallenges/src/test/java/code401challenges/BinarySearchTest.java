package code401challenges;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

//Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Return the index of the array’s element that is equal to the search key, or -1 if the element does not exist.

public class BinarySearchTest {
    //Test to see if it passes
    @Test public void testBinarySearch_foundKey() {
        assertEquals(
                "This array of more than one keys contains the key.",
                3,
                BinarySearch.searchArrForKey(new int[] {4, 8, 15, 16, 23, 42}, 16)
        );
    }

    //Test to check for value not in the array returning -1
    @Test public void testBinarySearch_keyNotFound() {
        assertEquals(
                "This array of more than one keys does not contain the key.",
                -1,
                BinarySearch.searchArrForKey(new int[] {4, 8, 15, 16, 23, 42}, 37)
        );
    }

    //Test empty array to return -1
    @Test public void testBinarySearch_emptyArr() {
        assertEquals(
                "This array is empty.",
                -1,
                BinarySearch.searchArrForKey(new int[] {}, 37)
        );
    }

    //Test to see if array of one returns correct value of -1 when not found
    @Test public void testBinarySearch_arrOfOneNoKey() {
        assertEquals(
                "This array does not contain the key.",
                -1,
                BinarySearch.searchArrForKey(new int[] {4}, 37)
        );
    }

    //Test to see if array of one returns correct value when found
    @Test public void testBinarySearch_arrOfOneWithKey() {
        assertEquals(
                "This array contains the key.",
                0,
                BinarySearch.searchArrForKey(new int[] {4}, 4)
        );
    }
}