package medium_problems;

import java.util.HashMap;

public class TwoSum {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5 };
    int target = 8;

    int[] res = twosum(nums, target);
    for (int i : res) {
      System.out.print(i + " ");
    }
  }

  static int[] twosum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int reqNum = target - nums[i];

      if (map.containsKey(reqNum)) {
        return new int[] { map.get(reqNum), i };
      }

      map.put(nums[i], i);
    }
    
    return new int[] { -1, -1 };

    // Brute force
    // for (int i = 0; i < nums.length; i++) {
    // for (int j = 1; j < nums.length; j++) {
    // int sum = nums[i] + nums[j];
    // if (sum == target) {
    // return new int[] { i, j };
    // }
    // }
    // }
    // return new int[] { -1, -1 };
  }
}
