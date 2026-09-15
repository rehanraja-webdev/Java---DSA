package subarray;

public class SumOfSubarray {
  public static void main(String[] args) {
    int[] nums = { 2, 5, 1, 4 };
    sumOfSubarray(nums);
  }

  static void sumOfSubarray(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      int sum = 0;
      for (int j = i; j < nums.length; j++) {
        sum += nums[j];
        System.out.print(sum + " ");
      }
      System.out.println();
    }
  }
}
