import java.util.Scanner;

public class Circle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    //circumference(Pridhi) of the circle = 2 * pi * r

    System.out.print("Enter the radius: ");
    double radius = scanner.nextDouble();

    double circumference = 2 * Math.PI * radius;
    double area = Math.PI * Math.pow(radius, 2);
    double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

    System.out.println("The circumference of the circle is: " + circumference);
    System.out.println("The area of the circle is: " + area);
    System.out.println("The volume of the circle is: " + volume);
    scanner.close();
  }
}
