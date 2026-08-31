package basic_problems;

public class IntegerPalindrome {
  public static void main(String[] args) {
    int x = -121;
    int reversed = 0;
    int original = x;

    while (original != 0) {
      reversed = reversed * 10 + original % 10;
      original = original / 10;
    }

    System.out.println(x == reversed);
  }
}