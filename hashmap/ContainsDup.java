import java.util.HashSet;

public class ContainsDup {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4 };
    System.out.println(containsDuplicate(arr));
  }

  static boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>();

    for (Integer num : nums) {
      if (set.contains(num)) {
        return true;
      }
      set.add(num);
    }

    return false;
  }
}
