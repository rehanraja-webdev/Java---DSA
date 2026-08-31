public class math {
  public static void main(String[] args) {
    double result = Math.pow(3, 2);
    double absValue = Math.abs(-5); //abs always gives positive value
    double sqrtValue = Math.sqrt(16);
    result = Math.round(34.64);
    result = Math.ceil(34.64);
    result = Math.floor(34.64);
    result = Math.max(10, 24);
    result = Math.min(10, 24);

    System.out.println(result);
    System.out.println(absValue);
    System.out.println(sqrtValue);
  }
}
