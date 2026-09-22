package subarray.medium;

import java.util.ArrayList;
import java.util.Arrays;

//Prob: Return the continuous indexes of which is equals target
public class IndexesOfSubarraySum {
  public static void main(String[] args) {

    int[] arr = { 1, 2, 4, 6, 7, 7 };
    int target = 17;
    ArrayList<Integer> list = subarraySum(arr, target);
    System.out.println(list);
  }

  static ArrayList<Integer> subarraySum(int[] arr, int target) {
    int sIdx = 0;
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];

      while (sum > target) {
        sum -= arr[sIdx];
        sIdx++;
      }
      if (sum == target) {
        return new ArrayList<>(Arrays.asList(sIdx, i));
      }
    }
    return new ArrayList<>(Arrays.asList(-1));
  }
}
