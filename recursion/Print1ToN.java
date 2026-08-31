package recursion;

//Print from 1 to N
public class Print1ToN {
  public static void main(String[] args) {
    int num = 1;

    printFrom1ToN(num);
  }

  static void printFrom1ToN(int num) {
    System.out.println(num);

    if (num == 10)
      return;
    printFrom1ToN(num + 1);
  }
}
