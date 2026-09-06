import java.util.HashMap;

public class FirstUnique {
  public static void main(String[] args) {
    String s = "rehanraja";
    System.out.println(firstUniqueChar(s));
  }

  static Character firstUniqueChar(String s) {
    HashMap<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
    }

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);

      if (map.get(ch) == 1) {
        return ch;
      }
    }
    System.out.println(map);

    return '$';
  }
}
