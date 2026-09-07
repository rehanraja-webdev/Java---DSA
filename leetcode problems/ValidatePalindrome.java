public class ValidatePalindrome {
  public static void main(String[] args) {
    String s = "A man, a plan, a canal: Panama";

    System.out.println(isPalindrome(s));
  }

  static boolean isPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
      if (!Character.isLetterOrDigit(s.charAt(left))) {
        left++;
      } else if (!Character.isLetterOrDigit(s.charAt(right))) {
        right--;
      } else if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
        return false;
      } else {
        left++;
        right--;
      }
    }
    return true;
  }
}
