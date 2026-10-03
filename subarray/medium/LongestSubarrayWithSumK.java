package subarray.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumK {
  public static void main(String[] args) {
    // int arr[] = { -5, 8, -14, 2, 4, 12 }, k = -5;
    // int arr[] = { 10, 5, 2, 7, 1, -10 }, k = 15;
    // int arr[] = { 10, -10, 20, 30 }, k = 5;
    int arr[] = { 10, 5, 2, 7, 1, -10 }, k = 9;
    System.out.println(longestSubarray(arr, k));
  }

  static int longestSubarray(int[] arr, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int sum = 0;
    int max = 0;

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      if (sum == k) {
        max = i + 1;
      }

      if (map.containsKey(sum - k)) {
        max = Math.max(max, map.get(sum - k) + 1);
      }
      if (!map.containsKey(sum)) {
        map.put(sum, i);
      }
    }
    System.out.println(map);
    System.out.println(max);
    return max;
  }

}
