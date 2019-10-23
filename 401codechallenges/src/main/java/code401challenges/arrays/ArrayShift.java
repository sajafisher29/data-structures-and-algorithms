package code401challenges.arrays;

import java.util.Arrays;

public class ArrayShift {

    public static int[] insertShiftArray(int[] originalArr, int insert) {
        int[] expandedArr = new int[originalArr.length +1];
        int middle = expandedArr.length/2;
        for (int i = 0; i < expandedArr.length; i++) {
            if (i < middle) {
                expandedArr[i] = originalArr[i];
            } else if (i == middle) {
                expandedArr[i] = insert;
            } else {
                expandedArr[i] = originalArr[i - 1];
            }
        }
        return expandedArr;
    }
}