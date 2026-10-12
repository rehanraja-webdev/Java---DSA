package medium_problems;

public class TwoSumSortedArray {
  public static void main(String[] args) {
    int[] nums = { 2, 4, 6, 8, 9 };
    int target = 12;
    int[] res = twoSum(nums, target);
    for (int num : res) {
      System.out.print(num + " ");
    }
  }

  static int[] twoSum(int[] nums, int t) {
    int left = 0;
    int right = nums.length - 1;
    
    while (left < right) {
      int sum = nums[left] + nums[right];
      if (sum == t)
        return new int[] { nums[left], nums[right] };
      else if (sum < t)
        left++;
      else
        right--;
    }
    return new int[] { -1, -1 };
  }
}
