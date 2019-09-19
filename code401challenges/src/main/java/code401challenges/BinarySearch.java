package code401challenges;

public class BinarySearch {

    public static int searchArrForKey(int[] keysArr, int key) {
        int startOfKeysArr = 0;
        int endOfKeysArr = keysArr.length-1;

        while (startOfKeysArr <= endOfKeysArr) {
            int middleOfKeysArr = (startOfKeysArr + endOfKeysArr)/2;
            if (keysArr[middleOfKeysArr] == key){
                return middleOfKeysArr;
            }
            if (keysArr[middleOfKeysArr] > key) {
                endOfKeysArr = middleOfKeysArr - 1;
            }
            if (keysArr[middleOfKeysArr] < key) {
                startOfKeysArr = middleOfKeysArr + 1;
            }
        }
        return -1;
    }
}
