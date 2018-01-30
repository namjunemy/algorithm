package sorting_in_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {
  public static void main(String[] args) {
    List<String> fruits = new ArrayList<>();
    fruits.add("pineapple");
    fruits.add("apple");
    fruits.add("orange");
    fruits.add("banana");

    Collections.sort(fruits);
    fruits.forEach(System.out::println);
  }
}
