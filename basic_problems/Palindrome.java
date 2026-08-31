package basic_problems;

public class Palindrome {
  public static void main(String[] args) {

    String text = "   Never! odd, {or} even";
    text = text.replaceAll("[^a-zA-z0-9]", "").toLowerCase();

    int left = 0, right = text.length() - 1;

    while (left < right) {
      if (text.charAt(left) != text.charAt(right)) {
        System.out.println("Given string is not a Palindrome: " + text);
        return;
      }

      left++;
      right--;
    }

    System.out.println("Given string is a Palindrome: " + text);
  }
}
