package basic_problems;

public class MaxProductOf2Digit {
  public static void main(String[] args) {
    int n = 31;
    System.out.println(maxProduct(n));
  }

  static int maxProduct(int n) {
    int d1 = Integer.MIN_VALUE;
    int d2 = Integer.MIN_VALUE;
    while (n != 0) {
      int rem = n % 10;
      if (rem > d1) {
        d2 = d1;
        d1 = rem;
      } else {
        d2 = Math.max(d2, rem);
      }
      n /= 10;
    }
    return d1 * d2;
  }
}
