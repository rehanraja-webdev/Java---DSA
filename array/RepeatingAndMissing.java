package array;

//Prob: You are given an array which have numbers from 1 to n. You have to find repeating and missing number. 
public class RepeatingAndMissing {
  public static void main(String[] args) {
    int[] nums = { 3, 4, 5, 2, 1, 4 };
    int[] res = repeatingAndMissing(nums);

    for (int num : res) {
      System.out.print(num + " ");
    }

  }

  //Brute force approach
  static int[] repeatingAndMissing(int[] nums) {
    int repeating = -1;
    int missing = -1;

    for (int i = 1; i <= nums.length; i++) {
      int count = 0;
      for (int num : nums) {
        if (num == i) {
          count++;
        }
      }
      if (count == 0) {
        missing = i;
      } else if (count == 2) {
        repeating = i;
      }
    }
    return new int[] { repeating, missing };
  }
}
