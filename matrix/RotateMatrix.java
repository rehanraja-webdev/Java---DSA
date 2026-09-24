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

    // int[][] result = rotateMatrix(mat);
    int[][] result = rotateMatrixOptimal(mat);

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

  static int[][] rotateMatrixOptimal(int[][] mat) {
    int m = mat.length;
    int n = mat[0].length;

    // Step 1: Transpose the matrix
    for (int i = 0; i < m - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        int t = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = t;
      }
    }

    // Step 2: reverse all the row
    for (int i = 0; i < m; i++) {
      reverse(mat, i);
    }

    return mat;
  }

  static void reverse(int[][] mat, int i) {
    int l = 0;
    int r = mat.length - 1;
    while (l < r) {
      int t = mat[i][l];
      mat[i][l] = mat[i][r];
      mat[i][r] = t;
      l++;
      r--;
    }
  }
}
