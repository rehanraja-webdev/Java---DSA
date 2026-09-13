package subarray;

//Calculate the sum till a specific index
public class RunningSum {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4 };
    int[] sum = runningSum(nums);
    System.out.println(sum[3]);
  }
  
  static int[] runningSum(int[] nums) {
    int[] res = new int[nums.length];
    int sum=0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      res[i] = sum;
    }
    
    return res;
  }
}
