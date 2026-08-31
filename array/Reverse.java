package array;

public class Reverse {
  public static void main(String[] args) {
    int[] arr = { 2, 64, 2, 3, 25 };

    int left = 0, right = arr.length - 1;

    while (left < right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;

      left++;
      right--;
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
