package sorting_in_java;

import java.util.Arrays;

public class StringSort {
  public static void main(String[] args) {
    String[] fruits = new String[]{"pineapple", "apple", "orange", "banana"};

    Arrays.sort(fruits);
    for(String name : fruits)
      System.out.println(name);
  }
}
