package two_pointer;

//Problem: You are given an integer array, you have to sqaure each element and sort it in accending order
public class SquareAndSort {
  public static void main(String[] args) {
    int[] nums = { 2, 3, 5 };
    // int[] nums = { -4, -1, 0, 3, 10 };
    int[] res = squareAndSortArray(nums);
    for (int num : res) {
      System.out.print(num + " ");
    }
  }

  static int[] squareAndSortArray(int[] arr) {
    int n = arr.length;
    int[] res = new int[n];
    int left = 0;
    int right = n - 1;

    int idx = n - 1;
    while (left <= right) {
      int leftSq = arr[left] * arr[left];
      int rightSq = arr[right] * arr[right];
      if (leftSq > rightSq) {
        res[idx] = leftSq;
        left++;
      } else {
        res[idx] = rightSq;
        right--;
      }
      idx--;
    }
    return res;
  }
}
