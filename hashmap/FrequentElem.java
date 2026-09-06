import java.util.HashMap;
import java.util.Map;

public class FrequentElem {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 2, 3, 4, 3, 2 };
    System.out.println(freqElem(arr));
  }

  static int freqElem(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int num : arr) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    int mf = Integer.MIN_VALUE;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > mf) {
        mf = entry.getValue();
      }
    }

    return mf;
  }
}
