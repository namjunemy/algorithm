package sorting_in_java;

import java.util.Arrays;

public class Primitive {
  public static void main(String[] args) {
    int[] data = {34, 22, 31, 37, 12};

    Arrays.sort(data);
    for(int a : data) {
      System.out.print(a + " ");
    }
  }
}
