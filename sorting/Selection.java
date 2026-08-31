package sorting;

public class Selection {
  public static void main(String[] args) {
    int[] arr = { 3, 14, 4, 45, 2, 54, 34, 43 };

    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int min = i;
      for (int j = i; j < n; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }

      int temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
