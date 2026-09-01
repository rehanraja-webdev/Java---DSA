package array;

import java.util.Scanner;

public class LeftRotateByK {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] arr = { 4, 5, 3, 2, 6, 7, 9 };
    int n = arr.length;

    System.out.print("Enter the no. of element to rotate: ");
    int k = scanner.nextInt();
    k %= n;

    RotateArray(arr, k, n);

    //Print the final array
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    scanner.close();
  }

  static void RotateArray(int[] arr, int k, int n) {
    //Create a temp array with the size of the k
    int[] t = new int[k];

    // Store the k elements in the temp array
    for (int i = 0; i < k; i++) {
      t[i] = arr[i];
    }
 
    //Shift the other element to the start of the array
    for (int i = k; i < n; i++) {
      arr[i - k] = arr[i];
    }

    int idx = 0;
    //copy the k element from the temp array to original array
    for (int i = n - k; i < n; i++) {
      arr[i] = t[idx++];
    }
  }
}
