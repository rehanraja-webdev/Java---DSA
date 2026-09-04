package array;

import java.util.ArrayList;

public class UnionOfTwoArray {
  public static void main(String[] args) {
    int[] arr1 = { 2, 4, 5, 5, 6, 6 };
    int[] arr2 = { 1, 2, 3, 3, 6, 8, 8, 9 };
    int n1 = arr1.length;
    int n2 = arr2.length;

    ArrayList<Integer> list = new ArrayList<>();
    int i = 0;
    int j = 0;

    while (i < n1 && j < n2) {
      if (arr1[i] <= arr2[j]) {
        if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
          list.add(arr1[i]);
        }
        i++;
      } else {
        if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
          list.add(arr2[j]);
        }
        j++;
      }
    }

    while (i < n1) {
      if (list.isEmpty() || arr1[i] != list.get(list.size() - 1)) {
        list.add(arr1[i]);
      }
      i++;
    }

    while (j < n2) {
      if (list.isEmpty() || arr2[j] != list.get(list.size() - 1)) {
        list.add(arr2[j]);
      }
      j++;
    }

    System.out.println(list);
  }
}
