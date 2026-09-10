package sliding_window;

import java.util.HashSet;

//Longest Substring Without Repeating Characters
public class LongestUniqueSubstring {
  public static void main(String[] args) {
    String s = "abcabcdbb";
    System.out.println(longestUniqueSubstring(s));
  }

  static int longestUniqueSubstring(String s) {

    HashSet<Character> set = new HashSet<>();

    int maxSubstring = 0;
    int l = 0;

    for (int r = 0; r < s.length(); r++) {

      char ch = s.charAt(r);

      while (set.contains(ch)) {
        set.remove(s.charAt(l));
        l++;
      }

      set.add(ch);

      maxSubstring = Math.max(maxSubstring, r - l + 1);
    }

    return maxSubstring;
  }
}
