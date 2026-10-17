import java.util.HashMap;

public class FreqCount1 {
  public static void main(String[] args) {
    String s = "ashusdgshfhfgfwieghsjf";

    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (map.containsKey(c)) {
        map.put(c, map.get(c) + 1);
      } else {
        map.put(c, 1);
      }
    }
    System.out.println(map);
  }
}
