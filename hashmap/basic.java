import java.util.HashMap;

public class basic {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    HashMap<Integer, Integer> map1 = new HashMap<>();

    map.put("name", "Rehan Raja");
    map.put("favCol", "Black");

    map1.put(1, 5);


    System.out.println(map1.size());
  }
}
