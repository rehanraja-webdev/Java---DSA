import java.util.HashMap;
import java.util.Map;

public class FreqCount {
  public static void main(String[] args) {

    int[] arr = { 3, 2, 3, 2, 2, 0, 5, 2, 4, 0, 1, 4, 5, 3, 2, 2 };

    HashMap<Integer, Integer> mpp = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      if (mpp.containsKey(arr[i])) {
        mpp.put(arr[i], mpp.get(arr[i]) + 1);
      } else {
        mpp.put(arr[i], 1);
      }
    }

    System.out.println(mpp);

    //Better formating
    for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
      System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
  }
}
