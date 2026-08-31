import java.util.Random;

public class random{
  public static void main(String[] args) {
    Random random = new Random();

    int num = random.nextInt(1, 7);
    System.out.println(num);

    boolean isHeads = random.nextBoolean();
    
    if (isHeads) {
      System.out.println("You got HEADS");
    } else {
      System.out.println("You got TAILS");
    }
  }
}