import java.util.HashMap;

public class ValidAnagram {
  public static void main(String[] args) {
    String s = "anagram";
    String t = "nagaram";

    System.out.println(isAnagram(s, t));
  }

  static boolean isAnagram(String s, String t) {
    HashMap<Character, Integer> map = new HashMap<>();
    HashMap<Character, Integer> map1 = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }

    for (int i = 0; i < t.length(); i++) {
      char ch = t.charAt(i);
      map1.put(ch, map1.getOrDefault(ch, 0) + 1);
    }

    if (map.equals(map1)) {
      return true;
    }
    return false;
  }
}
