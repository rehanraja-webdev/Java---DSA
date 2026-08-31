package array;

import java.util.Arrays;

public class FreqCount {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 2, 1, 2, 3, 1, 1, 4 };

    Arrays.sort(arr);

    int[] hash = new int[arr[arr.length - 1] + 1];

    for (int i = 0; i < arr.length; i++) {
      hash[arr[i]] += 1;
    }

    for (int i = 0; i < hash.length; i++) {
      System.out.printf("\nFreq of %d is: %d", i, hash[i]);
    }
  }
}
