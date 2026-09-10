package sliding_window;

public class MinSizeSubarraySum {
  public static void main(String[] args) {
    // int[] nums = { 2, 3, 1, 2, 4, 3 };
    int[] nums = { 1, 1, 1, 1, 1, 1, 1, 1, 7, 1 };
    int target = 7;

    System.out.println(minSizeSubarraySum(nums, target));
  }

  // Find the smallest subarray whose sum is greater than or equal to target
  static int minSizeSubarraySum(int[] arr, int target) {
    int left = 0;
    int sum = 0;
    int minSize = Integer.MAX_VALUE;

    for (int right = 0; right < arr.length; right++) {
      sum += arr[right];

      while (sum >= target) {

        minSize = Math.min(minSize, right - left + 1);

        sum -= arr[left];
        left++;
      }
    }

    return minSize == Integer.MAX_VALUE ? 0 : minSize;
  }
}
