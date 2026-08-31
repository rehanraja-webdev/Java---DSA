package recursion;

import java.util.Scanner;

// Print n to 1
public class PrintNTo1 {
  public static void main(String[] args) {

    System.out.print("Enter the value of n: ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    printNto1(n);
    scanner.close();
  }

  static void printNto1(int n) {
    if (n == 0)
      return;

    System.out.println(n);

    printNto1(n - 1);
  }
}
