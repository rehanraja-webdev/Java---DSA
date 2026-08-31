package sorting;

public class QuickSort {
  public static void main(String[] args) {
    int[] arr = { 3, 4, 2, 5, 6, 6, 3, 2, 1, 1, 5, 6, 7 };

    qSort(arr, 0, arr.length - 1);

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static void qSort(int[] arr, int low, int high) {
    if (low < high) {
      int pIdx = f(arr, low, high);
      qSort(arr, low, pIdx - 1);
      qSort(arr, pIdx + 1, high);
    }
  }

  static int f(int[] arr, int low, int high) {
    int p = arr[low];

    int i = low, j = high;

    while (i < j) {
      while (arr[i] <= p && i <= high - 1) {
        i++;
      }

      while (arr[j] > p && j >= low + 1) {
        j--;
      }
      // 3, 1, 2, 1, 2, 3, 6, 6, 5, 4, 5, 6, 7
      // 2, 1, 2, 1, 3 || 3,|| 6, 6, 5, 4, 5, 6, 7
      // 1, 1, 2, 2, || 3 || 3, ||6, 6, 5, 4, 5, 6, 7
      // 1, 1, 2, 2, || 3 || 3, ||6, 6, 5, 4, 5, 6, 7

      if (i < j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
      }
    }

    int t = arr[low];
    arr[low] = arr[j];
    arr[j] = t;

    return j;
  }
}