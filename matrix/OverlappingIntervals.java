package matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class OverlappingIntervals {
  public static void main(String[] args) {
    int arr[][] = {
        { 2, 4 },
        { 1, 3 },
        { 6, 9 },
        { 8, 10 },
        { 11, 15 }
    };

    System.out.println(overlappingIntervals(arr));
  }

  static ArrayList<ArrayList<Integer>> overlappingIntervals(int[][] arr) {
    Arrays.sort(arr, Comparator.comparingInt((int[] a) -> a[0]));

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

    int start = arr[0][0];
    int end = arr[0][1];
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      if (arr[i][0] < end) {
        end = Math.max(end, arr[i][1]);
      } else {
        res.add(new ArrayList<>(Arrays.asList(start, end)));
        System.out.println(Arrays.asList(start, end));
        start = arr[i][0];
        end = arr[i][1];
      }
    }
    res.add(new ArrayList<>(Arrays.asList(start, end)));
    return res;
  }
}
