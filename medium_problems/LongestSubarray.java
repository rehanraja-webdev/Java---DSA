package medium_problems;

public class LongestSubarray {
  public static void main(String[] args) {
    int[] arr = { 2, 1, 3, 1, 1, 1, 1, 5, 6 };

    int target = 3;
    System.out.println(longestSubarray(arr, target));
  }

  static int longestSubarray(int[] arr, int target) {
    int max = 0;
    int j = 0;
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      if (sum > target) {
        sum -= arr[j];
        j++;
      } else if (sum == target) {
        max = Math.max(max, i - j + 1);
      }
    }
    return max;
  }
}
