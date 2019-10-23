package code401challenges.sorting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    InsertionSort insertionSortTest;
    @Before
    public void setUp() throws Exception {
        insertionSortTest = new InsertionSort();
    }

    // Test for an empty array
    @Test
    public void testInsertionSortEmptyArray() {
        int[] array = new int[0];
        int[] sortedArray = insertionSortTest.insertionSort(array);

        assertArrayEquals(array, sortedArray);
    }

    // Test for one index in array
    @Test
    public void testInsertionSortArrayOneIndex() {
        int[] array = new int[]{-3};
        int[] sortedArray = insertionSortTest.insertionSort(array);

        assertArrayEquals(array, sortedArray);
    }

    // Test for two numbers in array pre sorted
    @Test
    public void testInsertionSortArrayTwoIndexesPreSorted() {
        int[] array = new int[]{0,28};
        int[] sortedArray = insertionSortTest.insertionSort(array);

        assertArrayEquals(array, sortedArray);
    }

    // Test for two numbers in array not pre sorted
    @Test
    public void testInsertionSortArrayTwoIndexesNotPreSorted() {
        int[] array = {78,-13};
        int[] sortedArray = insertionSortTest.insertionSort(array);
        int[] expected = {-13,78};

        assertArrayEquals(expected, sortedArray);
    }

    // Test for multiple numbers in array pre sorted
    @Test
    public void testInsertionSortArrayMultipleIndexesPreSorted() {
        int[] array = new int[]{1,3,5,6,7,8,9};
        int[] sortedArray = insertionSortTest.insertionSort(array);

        assertArrayEquals(array, sortedArray);
    }

    // Test for multiple numbers in array not pre sorted
    @Test
    public void testInsertionSortArrayMultipleIndexesNotPreSorted() {
        int[] array = new int[]{9,2,-10,3,18};
        int[] sortedArray = insertionSortTest.insertionSort(array);
        int[] expected = new int[]{-10,2,3,9,18};

        assertArrayEquals(expected, sortedArray);
    }

}