package code401challenges.sorting;

import org.junit.Before;
import org.junit.Test;
import static code401challenges.sorting.QuickSort.*;
import static org.junit.Assert.*;

public class QuickSortTest {

    QuickSort quickSortTest = new QuickSort();
    @Before
    public void setUp() {
        int[] arrayTest = {891, 0, 45, -3, 17, 4, 4, 1};
        quickSort(arrayTest, 0, arrayTest.length);
    }

    // Test for an empty array
    @Test
    public void testQuickSortEmptyArray() {
        int[] array = new int[0];
        int[] sortedArray = quickSort(array, 0, array.length);

        assertArrayEquals(array, sortedArray);
    }

    // Test for one index in array
    @Test
    public void testQuickSortArrayOneIndex() {
        int[] array = new int[]{-3};
        int[] sortedArray = quickSort(array, 0, array.length);

        assertArrayEquals(array, sortedArray);
    }

    // Test for two numbers in array pre sorted
    @Test
    public void testQuickSortArrayTwoIndexesPreSorted() {
        int[] array = new int[]{0,28};
        int[] sortedArray = quickSort(array, 0, array.length);

        assertArrayEquals(array, sortedArray);
    }

    // Test for two numbers in array not pre sorted
    @Test
    public void testQuickSortArrayTwoIndexesNotPreSorted() {
        int[] array = {78,-13};
        int[] sortedArray = quickSort(array, 0, array.length);
        int[] expected = {-13,78};

        assertArrayEquals(expected, sortedArray);
    }

    // Test for multiple numbers in array pre sorted
    @Test
    public void testQuickSortArrayMultipleIndexesPreSorted() {
        int[] array = new int[]{1,3,5,6,7,8,9};
        int[] sortedArray = quickSort(array, 0, array.length);

        assertArrayEquals(array, sortedArray);
    }

    // Test for multiple numbers in array not pre sorted
    @Test
    public void testQuickSortArrayMultipleIndexesNotPreSorted() {
        int[] array = new int[]{9,2,-10,3,18};
        int[] sortedArray = quickSort(array, 0, array.length);
        int[] expected = new int[]{-10,2,3,9,18};

        assertArrayEquals(expected, sortedArray);
    }

}