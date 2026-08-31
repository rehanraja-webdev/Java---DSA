package recursion;

import java.util.Scanner;

//Functional way
public class SumOfNNumber1 {
  public static void main(String[] args) {

    System.out.print("Enter the value of n: ");
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    System.out.println(sumTillN(n));

    scanner.close();
  }

  static int sumTillN(int n) {
    if (n < 1) {
      return 0;
    }

    return n + sumTillN(n - 1);
  }
}
