package code401challenges.sorting;

import java.util.Random;

// Reference for generating a random number in an array https://stackoverflow.com/questions/4023137/generating-a-random-index-for-an-array
// Reference for some elements of the partition, the pseudo code for that last section did not make sense to me https://www.geeksforgeeks.org/quick-sort/

public class QuickSort {

    public static int[] quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array by setting the position of the pivot value
            int position = partition(array, low, high);
            // Sort the left
            quickSort(array, low, position - 1);
            // Sort the right
            quickSort(array, position + 1, high);
        }
        return array;
    }

    public static int partition(int[] array, int low, int high) {
        // Set a pivot value as the point of reference
//        int randomIndex = new Random().nextInt(high); // We would need a random number between low and high
        int pivot = array[high]; // This is refactored to use high instead of a random number for now
        // Define a variable to track the largest index of numbers lower than the pivot point
        int i = low - 1;

        for (int j = low; j <= high; j++) {
            // If the current element is smaller than the pivot point
            if (array[j] < pivot) {
                // Increment the index of the smaller element
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i + 1] and array[high]
        int temp = array[i + 1];
        array[i + 1] = array[high]; // Having this set as = array[high] would require refactoring the code so that it is already at the high point
        array[high] = temp;

        return i + 1;
    }
}