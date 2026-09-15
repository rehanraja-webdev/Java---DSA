package dp;

public class BuyAndSellStock {
  public static void main(String[] args) {
    int[] nums = { 7, 1, 5, 3, 6, 4 };
    buyAndSell(nums);
  }

  static void buyAndSell(int[] nums) {
    int profit = 0;
    int cost = nums[0];
    for (int i = 1; i < nums.length; i++) {
      int sell = nums[i] - cost;
      profit = Math.max(profit, sell);
      cost = Math.min(cost, nums[i]);
    }

    System.out.println("Cost: " + cost);
    System.out.println("Profit: " + profit);
  }
}
