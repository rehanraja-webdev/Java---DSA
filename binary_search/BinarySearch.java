package binary_search;

public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 5, 7, 8, 9 };
    int target = 7;
    System.out.println(searchElement(arr, target));
  }

  static int searchElement(int[] arr, int target) {
    int low = 0, high = arr.length - 1;
    while (low <= high) {
      int mid = (low + high) / 2;

      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return -1;
  }
}
