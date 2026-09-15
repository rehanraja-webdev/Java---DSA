package subarray;

import java.util.ArrayList;
import java.util.List;

public class GenerateSubarray {
  public static List<List<Integer>> generateSubarrays(int[] arr) {
    List<List<Integer>> result = new ArrayList<>();

    for (int start = 0; start < arr.length; start++) {
      List<Integer> currentSubarray = new ArrayList<>();

      for (int end = start; end < arr.length; end++) {
        currentSubarray.add(arr[end]);

        result.add(new ArrayList<>(currentSubarray));
      }
    }

    return result;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3 };
    List<List<Integer>> subarrays = generateSubarrays(arr);

    for (List<Integer> sub : subarrays) {
      System.out.println(sub);
    }
  }
}