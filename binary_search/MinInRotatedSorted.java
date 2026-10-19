package binary_search;

//Prob:-> You are given an rotated sorted array, you have to return the minimum element; 
public class MinInRotatedSorted {
  public static void main(String[] args) {
    int[] nums = { 7, 8, 0, 3, 5, 6, 7 };
    System.out.println(minElement(nums));
  }

  static int minElement(int[] nums) {
    int low = 0, high = nums.length - 1;
    int ans = Integer.MAX_VALUE;

    while (low <= high) {
      int mid = (low + high) / 2;

      if (nums[low] <= nums[mid]) {
        ans = Math.min(ans, nums[low]);
        low = mid + 1;
      } else {
        ans = Math.min(ans, nums[mid]);
        high = mid - 1;
      }
    }
    return ans;
  }
}