package array;

//Prob: You are given two sorted arrays, Sort the arrays in such way that first array contains the min element of it's length and rest of the element in the second array
public class MergeSortedArray {
  public static void main(String[] args) {
    int[] arr1 = { 1, 4, 6, 9 };
    int[] arr2 = { 0, 2, 5, 6, 7 };

    mergeSortedArrayBF(arr1, arr2);

    for (int num : arr1) {
      System.out.print(num + " ");
    }
    System.out.println();
    for (int num : arr2) {
      System.out.print(num + " ");
    }
  }

  // Brute force approach, Time and space complexity O(m+n)
  static void mergeSortedArrayBF(int[] arr1, int[] arr2) {
    int m = arr1.length;
    int n = arr2.length;
    int[] temp = new int[m + n];
    int left = 0;
    int right = 0;
    int idx = 0;

    while (left < m && right < n) {
      if (arr1[left] <= arr2[right]) {
        temp[idx++] = arr1[left++];
      } else {
        temp[idx++] = arr2[right++];
      }
    }

    while (left < m) {
      temp[idx++] = arr1[left++];
    }

    while (right < n) {
      temp[idx++] = arr2[right++];
    }

    for (int i = 0; i < temp.length; i++) {
      if (i < m)
        arr1[i] = temp[i];
      else
        arr2[i - m] = temp[i];
    }
  }
}
