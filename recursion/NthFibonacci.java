package recursion;

import java.util.Scanner;

public class NthFibonacci {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the value of n: ");
    int n = scanner.nextInt();

    System.out.println(Fibonacci(n));
    scanner.close();
  }

  static int Fibonacci(int n) {
    if (n <= 1)
      return n;
    int last = Fibonacci(n - 1);
    int slast = Fibonacci(n - 2);

    return last + slast;
  }
}
