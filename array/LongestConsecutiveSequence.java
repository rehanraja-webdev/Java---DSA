package array;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
  public static void main(String[] args) {
    int[] nums = { 4, 2, 6, 5, 100, 2, 100, 1, 1, 102, 3, 101 };
    System.out.println(longestConsecutiveSequence(nums));
    System.out.println(longestConsecutiveOptimal(nums));
  }

  // Time complexity will be O(NlogN), because we are sorting the array first
  static int longestConsecutiveSequence(int[] nums) {
    int longest = 1;
    int count = 1;

    Arrays.sort(nums);
    int num = nums[0];

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] - 1 == num) {
        count++;
      } else if (nums[i] != num) {
        count = 1;
      }
      num = nums[i];
      longest = Math.max(longest, count);
    }
    return longest;
  }

  // Time and space complexity O(logN)
  static int longestConsecutiveOptimal(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : nums) {
      set.add(num);
    }

    int longest = 0;
    for (int num : set) {
      if (!set.contains(num - 1)) {
        int count = 1;
        int curNum = num;

        while (set.contains(curNum + 1)) {
          count++;
          curNum++;
        }
        longest = Math.max(longest, count);
      }
    }
    return longest;
  }
}
