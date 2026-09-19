package searching;

public class LastOccuranceOfNum {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 2, 2, 3, 4, 5 };
    int target = 2;
    System.out.println(lastOccuranceOfNum(nums, target));
  }

  static int lastOccuranceOfNum(int[] nums, int target) {
    int idx = -1;
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      int mid = (left + right) / 2;
      int num = nums[mid];
      if (target == num) {
        idx = mid;
        left = mid + 1;
      } else if (target > num) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return idx;
  }
}
