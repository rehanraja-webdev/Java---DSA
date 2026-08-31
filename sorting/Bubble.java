package sorting;

public class Bubble {
  public static void main(String[] args) {
    int[] arr = { 3, 14, 4, 45, 2, 54, 34, 43 };

    int n = arr.length;

    for (int i = 0; i < n; i++) {
      boolean swapped = false;
      for (int j = 1; j < n - i; j++) {
        if (arr[j - 1] > arr[j]) {
          int temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;
          swapped = true;
        }
      }

      if (!swapped) {
        break;
      }
    }

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
