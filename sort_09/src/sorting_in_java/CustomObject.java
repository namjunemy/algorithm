package sorting_in_java;

import java.util.Arrays;

public class CustomObject {
  public static void main(String[] args) {
    Fruit[] fruits = new Fruit[4];
    fruits[0] = new Fruit("pineapple", 70);
    fruits[1] = new Fruit("apple", 100);
    fruits[2] = new Fruit("orange", 80);
    fruits[3] = new Fruit("banana", 90);

    Arrays.sort(fruits);
    for(Fruit fruit : fruits)
      System.out.println(fruit);
  }
}
