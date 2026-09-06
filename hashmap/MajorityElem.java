import java.util.HashMap;
import java.util.Map;

public class MajorityElem {
  public static void main(String[] args) {
    int[] arr = { 2, 2, 1, 1, 1, 2, 1, 1, 2 };

    System.out.println(majorityElem(arr));
  }

  static int majorityElem(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > nums.length / 2) {
        return entry.getKey();
      }
    }

    return -1;
  }
}
