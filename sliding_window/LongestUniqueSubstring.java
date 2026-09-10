package sliding_window;

import java.util.HashSet;

//Longest Substring Without Repeating Characters
public class LongestUniqueSubstring {
  public static void main(String[] args) {
    String s = "abcabcdbb";
    System.out.println(longestUniqueSubstring(s));
  }

  static int longestUniqueSubstring(String s) {
    int maxSubstring = 0;
    HashSet<Character> set = new HashSet<>();
    
    int l = 0;
    for (int r = 0; r < s.length(); r++) {
      Character ch = s.charAt(r);

      if (set.contains(ch)) {
        l++;
      } else {
        set.add(ch);
        maxSubstring = Math.max(maxSubstring, r - l + 1);
      }
    }
    return maxSubstring;
  }
}
