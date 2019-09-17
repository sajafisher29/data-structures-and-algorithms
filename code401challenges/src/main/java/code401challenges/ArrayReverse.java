import java.util.Arrays;

public class ArrayReverse {

  public static void main(String[] args) {
    int[] arrToReverse = new int[]{2, 6, 9, 12};
    int[] reversedArray = reverseArray(arrToReverse);
    System.out.println(Arrays.toString(reversedArray));
  }

  public static int[] reverseArray(int[] arr) {

    int[] reversedArray = new int[arr.length]

    for(int i = arr.length-1; i >= 0; i--) {
      int count = 0;
      reversedArray[count] = arr[i];
      count++;
    }
    return reversedArray;
  }
}