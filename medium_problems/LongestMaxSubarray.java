package medium_problems;

public class LongestMaxSubarray {
  static int longestMaxSubarray(int[] arr) {
    int sum = 0;
    int max = Integer.MIN_VALUE;
    int startIdx = -1;
    int endIdx = -1;

    for (int i = 0; i < arr.length; i++) {
      if (sum < 0) {
        sum = 0;
      }

      if (sum == 0) {
        startIdx = i;
      }

      sum += arr[i];
      if (sum > max) {
        endIdx = i;
      }
      max = Math.max(max, sum);
    }
    System.out.println(startIdx + " " + endIdx);
    return max;
  }

  public static void main(String[] args) {
    int[] arr = { -2, -3, 4, -1, -2, 5, 1, -3 };
    System.out.println(longestMaxSubarray(arr));
  }
}
