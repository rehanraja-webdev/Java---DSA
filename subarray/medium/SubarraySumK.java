package subarray.medium;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumK {
  static int subarraySum(int[] nums, int k) {
    Map<Integer, Integer> prefixSumMap = new HashMap<>();

    // Base case: prefix sum of 0 has occurred once
    prefixSumMap.put(0, 1);

    int currentSum = 0;
    int count = 0;

    for (int num : nums) {
      currentSum += num;

      // If (currentSum - k) exists in map, add its frequency to count
      if (prefixSumMap.containsKey(currentSum - k)) {
        count += prefixSumMap.get(currentSum - k);
      }

      // Record the frequency of current prefix sum
      prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
    }

    return count;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 3, 6 };
    System.out.println(subarraySum(nums, 3)); // Output: 3 ([1,2], [3], [3])
  }
}