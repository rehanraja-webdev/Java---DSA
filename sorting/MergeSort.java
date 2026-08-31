package sorting;

import java.util.ArrayList;

public class MergeSort {
  public static void main(String[] args) {
    int[] arr = { 3, 23, 5, 2, 2, 5, 10, 7, 8, 43 };

    int low = 0, high = arr.length - 1;
    DevideArray(arr, low, high);

    for (int num : arr) {
      System.out.print(num + " ");
    }
  }

  static void DevideArray(int[] arr, int low, int high) {
    if (low >= high)
      return;

    int mid = (low + high) / 2;
    DevideArray(arr, low, mid);
    DevideArray(arr, mid + 1, high);
    Merge(arr, low, mid, high);
  }

  static void Merge(int[] arr, int low, int mid, int high) {
    ArrayList<Integer> temp = new ArrayList<>();
    int left = low, right = mid + 1;

    while (left <= mid && right <= high) {
      if (arr[left] <= arr[right]) {
        temp.add(arr[left]);
        left++;
      } else {
        temp.add(arr[right]);
        right++;
      }
    }

    while (left <= mid) {
      temp.add(arr[left]);
      left++;
    }

    while (right <= high) {
      temp.add(arr[right]);
      right++;
    }

    for (int i = low; i <= high; i++) {
      arr[i] = temp.get(i - low);
    }
    System.out.println("called");
  }
}
