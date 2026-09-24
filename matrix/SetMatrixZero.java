package matrix;

public class SetMatrixZero {
  public static void main(String[] args) {
    int m = 4;
    int n = 5;
    int[][] matrix = {
        { 1, 0, 1, 1, 0 },
        { 1, 1, 1, 1, 1 },
        { 1, 1, 1, 0, 1 },
        { 1, 1, 1, 1, 1 },
    };
    setMatrixZeroBrute(matrix, m, n);

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  //Brute force approach, time complexity O(n^3)
  static void setMatrixZeroBrute(int[][] matrix, int rows, int cols) {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (matrix[i][j] == 0) {
          int row = 0;
          int col = 0;
          while (row < rows) {
            if (matrix[row][j] == 1) {
              matrix[row][j] = -1;
            }
            row++;
          }
          while (col < cols) {
            if (matrix[i][col] == 1) {
              matrix[i][col] = -1;
            }
            col++;
          }
        }
      }
    }

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (matrix[i][j] == -1) {
          matrix[i][j] = 0;
        }
      }
    }
  }
}
