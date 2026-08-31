package array;

import java.util.Scanner;

public class Basic {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int n = scanner.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < arr.length; i++) {
      System.out.printf("Enter the value at index %d: ", i);
      arr[i] = scanner.nextInt();
    }

    for (int num : arr) {
      System.out.print(num + " ");
    }

    scanner.close();
  }

}
