package medium_problems;

//Problem: Remove duplicates from sorted array
public class RemoveDuplicates {
  public static void main(String[] args) {
    int[] arr = { 0, 0, 1, 2, 2, 3, 3, 3, 4 };
    // { 0, 0, 1, 2, 2, 3, 3, 3, 4 } i=0; j=0; arr[i] != arr[j] false -> no swap
    // { 0, 0, 1, 2, 2, 3, 3, 3, 4 } i=1; j=0; arr[i] != arr[j] false -> no swap
    // { 0, 1, 0, 2, 2, 3, 3, 3, 4 } i=2; j=0; arr[i] != arr[j] true -> swap
    // { 0, 1, 2, 0, 2, 3, 3, 3, 4 } i=3; j=1; arr[i] != arr[j] true -> swap
    // { 0, 1, 2, 0, 2, 3, 3, 3, 4 } i=4; j=2; arr[i] != arr[j] false -> no swap
    // { 0, 1, 2, 3, 2, 0, 3, 3, 4 } i=5; j=2; arr[i] != arr[j] true -> swap
    // { 0, 1, 2, 3, 2, 0, 3, 3, 4 } i=6; j=3; arr[i] != arr[j] false -> no swap
    // { 0, 1, 2, 3, 2, 0, 3, 3, 4 } i=7; j=3; arr[i] != arr[j] false -> no swap
    // { 0, 1, 2, 3, 4, 0, 3, 3, 2 } i=8; j=3; arr[i] != arr[j] true -> swap
    // final array -> { 0, 1, 2, 3, 4, 0, 3, 3, 2 }

    int j = removeDuplicates(arr);

    for (int i = 0; i <= j; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static int removeDuplicates(int[] arr) {
    int j = 0;
    if (arr.length == 1) {
      return 1;
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != arr[j]) {
        int t = arr[i];
        arr[i] = arr[j + 1];
        arr[j + 1] = t;
        j++;
      }
    }

    return j;
  }
}
