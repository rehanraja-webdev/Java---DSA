package array;

public class SortArrayByParityII {
  public static void main(String[] args) {
    int[] nums = { 4, 2, 5, 3 };
    sortArrayByParityII(nums);
    for (int num : nums) {
      System.out.print(num + " ");
    }
  }

  static int[] sortArrayByParityII(int[] nums) {
    int n = nums.length;
    int evenPtr = 0;
    int oddPtr = 1;
    while (evenPtr < n && oddPtr < n) {
      while (evenPtr < n && nums[evenPtr] % 2 == 0)
        evenPtr += 2;
      while (oddPtr < n && nums[oddPtr] % 2 != 0)
        oddPtr += 2;
      if (evenPtr < n && oddPtr < n) {
        int t = nums[oddPtr];
        nums[oddPtr] = nums[evenPtr];
        nums[evenPtr] = t;
      }
    }
    return nums;
  }
}