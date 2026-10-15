import java.util.HashMap;

//Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum is divisible by k.
public class SumDevisibleByK {
  public static void main(String[] args) {
    int[] nums = { 3, 4, 5, 3, 5, 6, 7 };
    int target = 7;
    System.out.println(solution(nums, target));
  }

  static int solution(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    int count = 0;
    int preSum = 0;

    for (int num : nums) {
      preSum += num;
      if (map.containsKey(preSum % target)) {
        count += map.get(preSum % target);
      }
      map.put(preSum % target, map.getOrDefault(preSum % target, 0) + 1);
    }
    return count;
  }
}