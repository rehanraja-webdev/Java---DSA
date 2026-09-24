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
    // setMatrixZeroBrute(matrix, m, n);
    setMatrixZeroBetter(matrix, m, n);

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  // Brute force approach, time complexity O(n^3)
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

  // Better approach, Time complexity will be O(2n^2) and
  // space complexity will be O(rows+cols)
  static void setMatrixZeroBetter(int[][] matrix, int rows, int cols) {
    int[] row = new int[rows];
    int[] col = new int[cols];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (matrix[i][j] == 0) {
          row[i] = 1;
          col[j] = 1;
        }
      }
    }

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (row[i] == 1 || col[j] == 1) {
          matrix[i][j] = 0;
        }
      }
    }
  }
}
