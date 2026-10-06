package sorting;

public class CycleSortAlgo {
  public static void main(String[] args) {
    int[] nums = { 2, 4, 1, -1 }; // i=0
    // int[] nums = { 4, 2, 1, -1 }; i=0
    // int[] nums = { -1, 2, 1, 4 }; i=0
    // int[] nums = { -1, 2, 1, 4 }; i=1
    // int[] nums = { 1, 2, -1, 4 }; i=2
    // int[] nums = { 1, 2, -1, 4 }; i=3

    System.out.println(cycleSortAlgo(nums));
  }

  static int cycleSortAlgo(int[] nums) {
    int n = nums.length;

    // Arrange array element to it's correct place
    for (int i = 0; i < n; i++) {
      while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
        int correctIdx = nums[nums[i] - 1];
        nums[nums[i] - 1] = nums[i];
        nums[i] = correctIdx;
      }
    }

    // identify the missing element which is not it's correct place
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != i + 1) {
        return i + 1;
      }
    }

    // Return n+1 if all the element are already present in the array
    return n + 1;
  }
}
