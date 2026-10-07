package array;

public class CountInversions {
  static int mergeAndCount(int[] arr, int low, int mid, int high) {
    int[] temp = new int[high - low + 1];
    int left = low;
    int right = mid + 1;
    int idx = 0;
    int invCount = 0;

    while (left <= mid && right <= high) {
      if (arr[left] <= arr[right]) {
        temp[idx++] = arr[left++];
      } else {
        temp[idx++] = arr[right++];
        invCount += (mid - left + 1);
      }
    }

    while (left <= mid) {
      temp[idx++] = arr[left++];
    }

    while (right <= high) {
      temp[idx++] = arr[right++];
    }

    for (int i = 0; i < temp.length; i++) {
      arr[i + low] = temp[i];
    }

    return invCount;
  }

  static int devideAndCount(int[] arr, int start, int end) {
    int count = 0;

    if (start < end) {
      int mid = (start + end) / 2;

      count += devideAndCount(arr, start, mid);
      count += devideAndCount(arr, mid + 1, end);
      count += mergeAndCount(arr, start, mid, end);
    }
    return count;
  }

  public static void main(String[] args) {
    int[] arr = { 3, 7, 5, 4, 2, 1, 4, 6 };
    System.out.println(devideAndCount(arr, 0, arr.length - 1));
  }
}
