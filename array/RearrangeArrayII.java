package array;

import java.util.ArrayList;
import java.util.List;

//Rearrange array by sign, start from positive, both will not be equal
//Ex:-> {2,4,-3,2,-4,6};
//Ans:-> {2,-3,4,-4,2,6};

public class RearrangeArrayII {
  public static void main(String[] args) {
    int[] nums = { 2, 4, -3, 2, -4, 6, 5, -8 };
    rearrangeArrayII(nums);

    for (int num : nums) {
      System.out.print(num + " ");
    }
  }

  static void rearrangeArrayII(int[] nums) {
    List<Integer> posList = new ArrayList<>();
    List<Integer> negList = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] >= 0) {
        posList.add(nums[i]);
      } else {
        negList.add(nums[i]);
      }
    }

    for (int i = 0; i < Math.min(posList.size(), negList.size()); i++) {
      nums[i * 2] = posList.get(i);
      nums[i * 2 + 1] = negList.get(i);
    }

    int idx = 2 * Math.min(posList.size(), negList.size());
    if (posList.size() > negList.size()) {
      for (int i = negList.size(); i < posList.size(); i++) {
        nums[idx++] = posList.get(i);
      }
    } else {
      for (int i = posList.size(); i < negList.size(); i++) {
        nums[idx++] = negList.get(i);
      }
    }
  }
}
