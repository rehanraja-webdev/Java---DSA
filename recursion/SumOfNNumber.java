package recursion;

//Parameterized way
public class SumOfNNumber {
  public static void main(String[] args) {
    sumTillN(0, 7);
  }

  static void sumTillN(int sum, int n) {

    if (n < 1) {
      System.out.println(sum);
      return;
    }
    sumTillN(sum + n, n - 1);
  }
}
