package matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
  public static void main(String[] args) {
    int[][] mat = {
        { 1, 2, 3 },
        { 8, 9, 4 },
        { 7, 6, 5 },
    };
    spiraltraverse(mat);
  }

  static void spiraltraverse(int[][] mat) {
    int n = mat.length;
    int left = 0;
    int right = n - 1;
    int top = 0;
    int bottom = n - 1;

    List<Integer> list = new ArrayList<>();

    while (left <= right && top <= bottom) {
      for (int i = left; i <= right; i++) {
        list.add(mat[top][i]);
      }
      top++;

      for (int i = top; i <= bottom; i++) {
        list.add(mat[i][right]);
      }
      right--;

      if (top <= bottom) {
        for (int i = right; i >= left; i--) {
          list.add(mat[bottom][i]);
        }
        bottom--;
      }

      if (left <= right) {
        for (int i = bottom; i >= top; i--) {
          list.add(mat[i][left]);
        }
        left++;
      }
    }
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
  }
}
