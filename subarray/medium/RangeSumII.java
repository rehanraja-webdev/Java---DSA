package subarray.medium;

//Calculate the prefix sum and find sum between a range of indexes. 
// Ex-> rangeSum(arr, left, rigth);
public class RangeSumII {
  static int rangeSum(int[] prefix, int left, int right) {
    return prefix[right + 1] - prefix[left];
  }

  static int[] buildPrefixSum(int[] arr) {
    int[] prefixSum = new int[arr.length + 1];
    prefixSum[0] = 0;
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      prefixSum[i + 1] = sum;
    }

    return prefixSum;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 4, 1, 5, 3 };

    int[] prefix = buildPrefixSum(nums);

    System.out.println(rangeSum(prefix, 1, 3));
  }
}
