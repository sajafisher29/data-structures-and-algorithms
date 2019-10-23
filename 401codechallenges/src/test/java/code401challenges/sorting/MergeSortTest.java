package code401challenges.sorting;

import org.junit.Test;
import static code401challenges.sorting.MergeSort.mergeSort;
import static org.junit.Assert.*;

public class MergeSortTest {

    // Test for an empty array
    @Test
    public void testMergeSortEmptyArray() {
        int[] array = new int[0];
        int[] sortedArray = mergeSort(array);

        assertArrayEquals(array, sortedArray);
    }

    // Test for one index in array
    @Test
    public void testMergeSortArrayOneIndex() {
        int[] array = new int[]{-3};
        int[] sortedArray = mergeSort(array);

        assertArrayEquals(array, sortedArray);
    }

    // Test for two numbers in array pre sorted
    @Test
    public void testMergeSortArrayTwoIndexesPreSorted() {
        int[] array = new int[]{0,28};
        int[] sortedArray = mergeSort(array);

        assertArrayEquals(array, sortedArray);
    }

    // Test for two numbers in array not pre sorted
    @Test
    public void testMergeSortArrayTwoIndexesNotPreSorted() {
        int[] array = {78,-13};
        int[] sortedArray = mergeSort(array);
        int[] expected = {-13,78};

        assertArrayEquals(expected, sortedArray);
    }

    // Test for multiple numbers in array pre sorted
    @Test
    public void testMergeSortArrayMultipleIndexesPreSorted() {
        int[] array = new int[]{1,3,5,6,7,8,9};
        int[] sortedArray = mergeSort(array);

        assertArrayEquals(array, sortedArray);
    }

    // Test for multiple numbers in array not pre sorted
    @Test
    public void testMergeSortArrayMultipleIndexesNotPreSorted() {
        int[] array = new int[]{9,2,-10,3,18};
        int[] sortedArray = mergeSort(array);
        int[] expected = new int[]{-10,2,3,9,18};

        assertArrayEquals(expected, sortedArray);
    }

}