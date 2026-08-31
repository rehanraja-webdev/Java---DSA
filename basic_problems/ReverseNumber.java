package basic_problems;

class ReverseNumber {
  public static void main(String[] args) {
    int num = 1534236469;
    long result = 0;

    while (num != 0) {
      int rem = num % 10;
      num /= 10;
      result = result * 10 + rem;
    }

    if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
      System.out.println("The result is: 0");
    } else {
      System.out.println("Reversed result is: " + result);
    }

  }

}