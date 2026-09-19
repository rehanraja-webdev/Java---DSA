package searching;

//Find the index of target to be inserted
public class SearchInsertPos {
  public static void main(String[] args) {
    int[] nums = { 1, 3, 5, 6 };
    int target = 4;
    System.out.println(searchInsertPos(nums, target));
  }

  static int searchInsertPos(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;

      if (target > nums[mid]) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return left;
  }
}