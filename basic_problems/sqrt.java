package basic_problems;

//TODO: incomplete
//Find the Square root of the number without using any built in function
public class sqrt {
  public static void main(String[] args) {
    int num = 93;

    for (int i = 1; i < num; i++) {
      if (i * i == num) {
        System.out.println(i);
        break;
      }
    }
  }
}
