package matrix;

public class SetMatrixZeroOptimal {
  public static void main(String[] args) {
    int m = 4;
    int n = 4;
    int[][] matrix = {
        { 1, 0, 1, 1 },
        { 1, 1, 1, 1 },
        { 1, 1, 0, 1 },
        { 1, 1, 1, 1 },
    };

    setMatrixZero(matrix, m, n);

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  static void setMatrixZero(int[][] matrix, int rows, int cols) {
    int col0 = 1;

    // Step 1: Mark rows and columns using the first row and column as markers
    for (int i = 0; i < rows; i++) {
      if (matrix[i][0] == 0) {
        col0 = 0;
      }
      for (int j = 1; j < cols; j++) {
        if (matrix[i][j] == 0) {
          matrix[i][0] = 0;
          matrix[0][j] = 0;
        }
      }
    }

    // Step 2: Update inner cells (1 to rows-1, 1 to cols-1) based on markers
    for (int i = 1; i < rows; i++) {
      for (int j = 1; j < cols; j++) {
        if (matrix[0][j] == 0 || matrix[i][0] == 0) {
          matrix[i][j] = 0;
        }
      }
    }

    // Step 3: Handle the first row based on matrix[0][0]
    if (matrix[0][0] == 0) {
      for (int j = 0; j < cols; j++) {
        matrix[0][j] = 0;
      }
    }

    // Step 4: Handle the first column based on col0
    if (col0 == 0) {
      for (int i = 0; i < rows; i++) {
        matrix[i][0] = 0;
      }
    }
  }
}
