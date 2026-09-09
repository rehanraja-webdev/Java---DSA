package sliding_window;

public class MaxSubarrayAvg {
  public static void main(String[] args) {
    int[] nums = { 1, 12, -5, -6, 50, 3 };
    int k = 4;
    System.out.println(maxSubarrayAvg(nums, k));
  }

  static double maxSubarrayAvg(int[] nums, int winSize) {
    int sum = 0;
    double maxAvg = 0;
    for (int right = 0; right < nums.length; right++) {
      sum += nums[right];
      if (right >= winSize - 1) {
        maxAvg = Math.max(maxAvg, (double) sum / winSize);
        sum -= nums[right - winSize + 1];
      }
    }

    return maxAvg;
  }
}
