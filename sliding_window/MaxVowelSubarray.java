package sliding_window;

//Find the subarray of size k with maximum number of vowels
public class MaxVowelSubarray {
  public static void main(String[] args) {

    String s = "abciiidef";
    int k = 3;
    System.out.println(maxVowelSubarray(s, k));
  }

  static int maxVowelSubarray(String s, int winSize) {
    int maxVowel = 0;
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (isVowel(s.charAt(i)))
        count++;

      if (i >= winSize - 1) {
        maxVowel = Math.max(maxVowel, count);
        if (isVowel(s.charAt(i - winSize + 1))) {
          count--;
        }
      }
    }
    return maxVowel;
  }

  static boolean isVowel(char ch) {
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
  }
}
