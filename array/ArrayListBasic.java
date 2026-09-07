package array;

import java.util.ArrayList;

public class ArrayListBasic {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(0, 2);
    //1 will occupy the 0th index and 2 will move to next index
    list.add(0, 1);
    
    System.out.println(list);
    list.add(0, 0);
    list.add(0, 6);

    //add element at the last index
    list.add(5);

    //set method override the index
    list.set(0, 3);

    if (list.contains(2)) {
      System.out.println(true);
    }

    list.addFirst(9); //add 9 at index 0
    list.addLast(8); //add 8 at the last index

    list.clear();

    if (list.isEmpty()) {
      System.out.println("List is empty!");
    }
    
    System.out.println(list);
  }
}