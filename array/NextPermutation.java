package array;

public class NextPermutation {
  public static void main(String[] args) {
    // int[] arr = { 1, 2, 3, 4, 5 };
    int[] arr = { 5, 4, 3, 1, 3, 2 };
    // int[] arr = { 5, 4, 3, 1 };

    nextPermutation(arr);
    for (int elem : arr) {
      System.out.print(elem + " ");
    }
  }

  static void nextPermutation(int[] arr) {
    int n = arr.length;
    int idx = -1;
    // Step 1: Find the index where arr[i] < arr[i+1];
    for (int i = n - 2; i >= 0; i--) {
      if (arr[i] < arr[i + 1]) {
        idx = i;
        break;
      }
    }

    // Check if the array in the decreasing order, then reverse
    if (idx == -1) {
      int right = n - 1;
      for (int left = 0; left < right; left++) {
        int t = arr[left];
        arr[left] = arr[right];
        arr[right] = t;
        right--;
      }
      return;
    }

    // Find the minimum element which is greater than arr[idx]
    for (int i = n - 1; i > idx; i--) {
      if (arr[i] > arr[idx]) {
        int t = arr[i];
        arr[i] = arr[idx];
        arr[idx] = t;
        break;
      }
    }

    // Reverse the remaining part
    int right = n - 1;
    for (int i = idx + 1; i < right; i++) {
      int t = arr[right];
      arr[right] = arr[i];
      arr[i] = t;
      right--;
    }
  }
}
