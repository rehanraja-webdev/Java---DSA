package array;

public class MoveAllZero {
  public static void main(String[] args) {
    int[] arr = { 1, 4, 0, 5, 7, 0, 0, 8 };

    int j = 0; // Pointer for the next non-zero placement

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        j++;
      }
    }

    // Print array
    for (int val : arr) {
      System.out.print(val + " ");
    }
  }
}