package array;

public class LeftRotateBy1 {
  public static void main(String[] args) {

    int[] arr = { 4, 5, 3, 2, 6, 7, 9 };

    int n = arr.length;

    RotateArray(arr, n);

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static void RotateArray(int[] arr, int n) {
    int t = arr[0];

    for (int i = 1; i < n; i++) {
      arr[i - 1] = arr[i];
    }
    arr[n - 1] = t;
  }
}
