package subarray.medium;

//sum of elements on LEFT = sum of elements on RIGHT
public class FindPivotIndex {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, -6, 6, 5,-11, 6 };
    // int[] nums = { 3,4,1,12,-20,7,0 };
    // int[] nums = { 11, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3 };
    // int[] nums = { 1, 7, 3, 6, 5, 6 };
    System.out.println(pivotIndex(nums));
  }

  static int pivotIndex(int[] nums) {
    int total = 0;
    for (int num : nums) {
      total += num;
    }
    int leftSum = 0;
    int rightSum = 0;
    
    for (int i = 0; i < nums.length; i++) {
      rightSum = total - leftSum - nums[i];
      if (rightSum == leftSum) {
        return i;
      }
      
      leftSum += nums[i];
    }

    return -1;
  }
}
