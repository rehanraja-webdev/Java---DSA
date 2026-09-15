package subarray.medium;

public class MaxSubarraySumKadane {
  public static void main(String[] args) {
    int[] nums = { 1, 2, -2, 3, 4, -1 };
    System.out.println(maxSubarraySum(nums));
  }

  static int maxSubarraySum(int[] nums) {
    int currentSum = nums[0];
    int maxSum = nums[0];

    for (int i = 1; i < nums.length; i++) {
      currentSum = Math.max(nums[i], currentSum + nums[i]);
      maxSum = Math.max(maxSum, currentSum);
    }

    return maxSum;
  }
}
