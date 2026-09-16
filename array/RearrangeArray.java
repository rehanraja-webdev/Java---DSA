package array;

import java.util.ArrayList;
import java.util.List;

//Rearrange array by sign, start from positive, And the positive and negative elements are equals
public class RearrangeArray {
  public static void main(String[] args) {
    int[] nums = { -2, 2, 3, -3, -5, 8 };
    rearrangeArray(nums);

    for (int num : nums) {
      System.out.print(num + " ");
    }
  }

  static void rearrangeArray(int[] nums) {
    List<Integer> posList = new ArrayList<>();
    List<Integer> negList = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] >= 0) {
        posList.add(nums[i]);
      } else {
        negList.add(nums[i]);
      }
    }

    for (int i = 0; i < nums.length/2; i++) {
      nums[i*2] = posList.get(i);
      nums[i*2+1] = negList.get(i);
    }
  }
}
