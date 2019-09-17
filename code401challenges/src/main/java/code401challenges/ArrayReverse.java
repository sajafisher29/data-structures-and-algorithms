import java.util.Arrays;

public class ArrayReverse {

  public static void main(String[] args) {
    int[] arrToReverse = new int[]{2, 6, 9, 12, 15};
    int[] reversedArray = reverseArray(arrToReverse);
    int[] shrunkArray = shrinkArray(arrToReverse);
    System.out.println(Arrays.toString(reversedArray));
  }

  public static int[] reverseArray(int[] arr) {

    int[] reversedArray = new int[arr.length];
    
    int count = 0;

    for(int i = arr.length-1; i >= 0; i--) {
      reversedArray[count] = arr[i];
      count++;
    }
    return reversedArray;
  }

  public static int[] shrinkArray(int[] arr) {

    int[] shrunkArray = new int[arr.length];
    
    int begin = 0;
    int end = arr.length-1;

    while(begin < end) {
      int tempHold = arr[begin];
      arr[end] = arr[begin];
      arr[begin] = tempHold;
      begin++;
      end--;
    }
    return shrunkArray;
  }
}