package subarray;

public class MaxSubarraySum {
  public static void main(String[] args) {
    int[] nums = { 1, -2, 3, 4, -1 };
    System.out.println(maxSubarraySum(nums));
  }

  static int maxSubarraySum(int[] nums) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      int sum = 0;
      for (int j = i; j < nums.length; j++) {
        sum += nums[j];
        max = Math.max(max, sum);
      }
    }
    return max;
  }
}
