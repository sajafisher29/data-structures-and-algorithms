package code401challenges.sorting;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort (int[] array) {
        int n = array.length;

        if (n < 2) {
            return array;
        } else {
            int middle = n/2;
            int[] left = Arrays.copyOfRange(array, 0, middle);
            int[] right = Arrays.copyOfRange(array, middle, n);

            // Sort the left side
            mergeSort(left);
            // Sort the right side
            mergeSort(right);
            // Sort the two sides together
            merge(left, right, array);
        }
        return array;
    }

    private static void merge(int[] left, int[] right, int[] array) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i = i + 1;
            } else {
                array[k] = right[j];
                j = j + 1;
            }

            k = k + 1;
        }

        while (i < left.length) {
            // Set remaining indexes in array to remaining values in left
            array[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            // Set remaining indexes in array to remaining values in right
            array[k] = right[j];
            j++;
            k++;
        }
    }
}