package array;

public class ShortAnArrayOf012 {
  public static void main(String[] args) {
    int[] arr = { 1, 1, 0, 1, 2, 2, 0, 0, 2, 1 };
    sortArray(arr);

    for (int num : arr) {
      System.out.print(num + " ");
    }
  }

  static void sortArray(int[] arr) {
    int start = 0;
    int mid = 0;
    int end = arr.length - 1;

    while (mid <= end) {
      if (arr[mid] == 0) {
        int t = arr[start];
        arr[start] = arr[mid];
        arr[mid] = t;
        start++;
        mid++;
      } else if (arr[mid] == 1) {
        mid++;
      } else {
        int t = arr[mid];
        arr[mid] = arr[end];
        arr[end] = t;
        end--;
      }
    }
  }
}
