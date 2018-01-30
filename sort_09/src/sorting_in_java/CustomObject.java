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
    for (Fruit fruit : fruits)
      System.out.println(fruit);

    Fruit2[] fruits2 = new Fruit2[4];
    fruits2[0] = new Fruit2("pineapple", 70);
    fruits2[1] = new Fruit2("apple", 100);
    fruits2[2] = new Fruit2("orange", 80);
    fruits2[3] = new Fruit2("banana", 90);

    Arrays.sort(fruits2, Fruit2.nameComparator);
    for (Fruit2 fruit : fruits2)
      System.out.println(fruit);
  }
}
