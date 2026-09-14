//Find Majority element from the array without HashMap
public class MajorityElemII {
  public static void main(String[] args) {
    int[] nums = { 2, 1, 1, 1, 3, 3, 2, 1, 1 };

    System.out.println(majorityElem(nums));
  }

  static int majorityElem(int[] nums) {
    int elem = 0;
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (count == 0) {
        elem = nums[i];
      }

      if (nums[i] == elem) {
        count++;
      } else {
        count--;
      }
    }

    count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == elem) {
        count++;
      }
    }

    if (count > nums.length / 2) {
      return elem;
    }

    return -1;
  }
}
