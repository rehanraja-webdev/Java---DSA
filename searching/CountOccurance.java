package searching;

//Find the Occurance of number in the sorted array
public class CountOccurance {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 2, 2, 2, 3, 4, 5 };
    int target = 2;
    System.out.println(countOccurance(nums, target));
  }

  static int countOccurance(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    int firstIdx = -1;
    int lastIdx = -1;

    while (left <= right) {
      int mid = (left + right) / 2;
      int num = nums[mid];

      if (target == num) {
        firstIdx = mid;
        right = mid - 1;
      } else if (target < num) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    left = 0;
    right = nums.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      int num = nums[mid];
      if (target == num) {
        lastIdx = mid;
        left = mid + 1;
      } else if (target < num) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    if (firstIdx == -1) {
      return 0;
    }

    return lastIdx - firstIdx + 1;
  }
}
