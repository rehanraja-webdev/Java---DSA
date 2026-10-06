package medium_problems;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
  public static void main(String[] args) {
    int n = 5;
    System.out.println(pascalTriangle(n));
  }

  static List<List<Integer>> pascalTriangle(int n) {
    List<List<Integer>> res = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      res.add(generateRow(i));
    }
    return res;
  }

  static List<Integer> generateRow(int n) {
    List<Integer> temp = new ArrayList<>();
    temp.add(1);
    long num = 1;
    for (int i = 1; i < n; i++) {
      num = num * (n - i) / i;
      temp.add((int) num);
    }
    return temp;
  }
}
