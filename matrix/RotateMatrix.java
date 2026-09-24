package matrix;

//Prob: Rotate matrix/image by 90 degree clock wise
public class RotateMatrix {
  public static void main(String[] args) {
    int[][] mat = {
        { 1, 3, 2, 5 },
        { 1, 9, 8, 3 },
        { 2, 7, 2, 5 },
        { 1, 0, 2, 2 },
    };

    int[][] result = rotateMatrix(mat);

    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[0].length; j++) {
        System.out.print(result[i][j] + " ");
      }
      System.out.println();
    }
  }

  // Brute force approach. Time and space complexity = O(n^2)
  static int[][] rotateMatrix(int[][] mat) {
    int n = mat.length;

    int[][] result = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        result[j][n - i - 1] = mat[i][j];
      }
    }
    return result;
  }
}
