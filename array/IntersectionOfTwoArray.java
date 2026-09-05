package array;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArray {
  public static void main(String[] args) {
    int[] arr1 = { 1, 3, 3, 5, 6, 6, 8, 8 };
    int[] arr2 = { 2, 3, 3, 4, 4, 6, 8 };
    int n1 = arr1.length;
    int n2 = arr2.length;

    List<Integer> intersect = new ArrayList<>();

    int i = 0;
    int j = 0;

    while (i < n1 && j < n2) {
      if (arr1[i] < arr2[j]) {
        i++;
      } else if (arr2[j] < arr1[i]) {
        j++;
      } else {
        intersect.add(arr1[i]);
        i++;
        j++;
      }
    }

    System.out.println(intersect);

  }
}
