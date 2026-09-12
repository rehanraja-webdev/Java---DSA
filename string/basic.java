package string;

import java.util.Arrays;

public class basic {
  public static void main(String[] args) {

    String s = "rehanraja";
    String sub = s.substring(5, 9);

    char[] chars = s.toCharArray();
    Arrays.sort(chars);

    for (char c : chars) {
      System.out.print(c + " ");
    }
    System.out.println("\n" + sub);
  }
}
