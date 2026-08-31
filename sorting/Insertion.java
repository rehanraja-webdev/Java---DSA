package sorting;

public class Insertion {
  public static void main(String[] args) {
    int[] arr = { 41, 43, 4, 5, 2, 23, 5, 3, 2, 4, 5, 3, 32, 2 };

    for (int i = 0; i < arr.length - 1; i++) {
      int j = i;

      while (j >= 0 && arr[j] > arr[j + 1]) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
        j--;
      }
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}