package array;

public class LargestElement {
  public static void main(String[] args) {

    int[] arr = { 3, 5, 6, 8, 2, 9, 1 };

    int LargestElem = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > LargestElem) {
        LargestElem = arr[i];
      }
    }
    System.out.println(LargestElem);
  }
}
