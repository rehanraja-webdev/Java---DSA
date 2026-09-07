package medium_problems;

public class TwoSumII {
  public static void main(String[] args) {
    int[] arr = { 2, 7, 11, 15 };
    int target = 22;

    int[] res = twosumII(arr, target);

    for (int num : res) {
      System.out.print(num + " ");
    }
  }

  static int[] twosumII(int[] arr, int target) {
    int l = 0, r = arr.length - 1;

    while (l < r) {
      int sum = arr[l] + arr[r];

      if (sum > target) {
        r--;
      } else if (sum < target) {
        l++;
      } else {
        return new int[] { l, r };
      }
    }

    return new int[] { -1, -1 };
  }
}
