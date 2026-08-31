package array;

public class FreqCountChar {
  public static void main(String[] args) {
    String s = "Rehan Raja";

    int[] hash = new int[255];

    for (int i = 0; i < s.length(); i++) {
      hash[s.charAt(i)] += 1;
    }

    for (int i = 0; i < hash.length; i++) {
      System.out.printf("\nFreq of %c is: %d", i, hash[i]);
    }
    
  }
}
