import java.util.Scanner;

public class Hypotenuse {
  public static void main(String[] args) {
    //c = SquareRoot of a^2 + b^2

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the length of side A: ");
    double a = scanner.nextDouble();
    
    System.out.print("Enter the length of side B: ");
    double b = scanner.nextDouble();

    double result = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

    System.out.println("The hypotenuse (side C) is: "+ result);
    scanner.close();
  }
}
