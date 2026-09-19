package searching;

//Prob: Find the first occurance of target in the sorted array
public class FirstOccuranceOfNum {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 2, 2, 3, 4, 5 };
    int target = 2;
    System.out.println(firstOccuranceOfNum(nums, target));
  }

  static int firstOccuranceOfNum(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    int idx = -1;

    while (left <= right) {
      int mid = (left + right) / 2;
      if (target == nums[mid]) {
        idx = mid;
        right = mid - 1;
      } else if (target > nums[mid]) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return idx;
  }
}
