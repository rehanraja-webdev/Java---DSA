package array;

public class MissingElem {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 5 };
    int n = 5;

    System.out.println(missingElem(arr, n));
    System.out.println(missingElem1(arr, n));
    System.out.println(missingElem2(arr, n));
  }

  static int missingElem(int[] arr, int n) {
    int sum = 0;
    int res = n * (n + 1) / 2;

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }

    return res - sum;
  }

  static int missingElem1(int[] arr, int n) {
    int count = 1;
    for (int i = 1; i < n; i++) {
      if (count != arr[i - 1]) {
        break;
      }
      count++;
    }

    return count;
  }

  static int missingElem2(int[] arr, int n) {
    int xor1 = 0;
    int xor2 = 0;

    for (int i = 0; i < n - 1; i++) {
      xor1 ^= (i + 1);
      xor2 ^= arr[i];
    }

    return xor1 ^ n ^ xor2; // xor with n because the loop will run n-1
  }
}
