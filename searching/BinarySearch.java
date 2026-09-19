package searching;

public class BinarySearch {
  public static void main(String[] args) {
    int[] nums = { 1, 3, 5, 7, 9, 11, 15 };
    int target = 9;

    System.out.println(binarySearch(nums, target));
  }

  static int binarySearch(int[] nums, int target) {
    int idx = -1;
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      int value = nums[mid];
      if (target == value) {
        return mid;
      } else if (target < value) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return idx;
  }
}
