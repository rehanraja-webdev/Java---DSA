package medium_problems;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
  static List<List<Integer>> threesum(int[] arr) {

    Arrays.sort(arr);

    List<List<Integer>> result = new ArrayList<>();

    for (int i = 0; i < arr.length - 2; i++) {

      // Skip duplicate fixed values
      if (i > 0 && arr[i] == arr[i - 1]) {
        continue;
      }

      int left = i + 1;
      int right = arr.length - 1;

      while (left < right) {
        int sum = arr[i] + arr[left] + arr[right];

        if (sum == 0) {
          result.add(Arrays.asList(arr[i], arr[left], arr[right]));

          left++;
          right--;

          // Skip duplicate left values
          while (left < right && arr[left] == arr[left - 1]) {
            left++;
          }

          // Skip duplicate right values
          while (left < right && arr[right] == arr[right + 1]) {
            right--;
          }

        } else if (sum < 0) {
          left++;
        } else {
          right--;
        }
      }
    }

    return result;
  }

  public static void main(String[] args) {
    int[] arr = { -1, 0, 1, 2, -1, -4 };

    List<List<Integer>> result = threesum(arr);

    for (List<Integer> triplet : result) {
      System.out.println(triplet);
    }
  }
}
