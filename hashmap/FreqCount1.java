import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FreqCount1 {
  public static void main(String[] args) {
    String s = "ashusdgshfhfgfwieghsjf";

    HashMap<Character, Integer> map = new HashMap<>();
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (map.containsKey(c)) {
        map.put(c, map.get(c) + 1);
      } else {
        map.put(c, 1);
      }
    }
    //TODO: Find the key with most freq

    // int greater;
    // for (Map.Entry<Character, Integer> key : map.entrySet()) {
    //   if (key) {
        
    //   }
    // }

    System.out.println(map);
  }
}
