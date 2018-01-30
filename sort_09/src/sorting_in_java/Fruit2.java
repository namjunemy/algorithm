package sorting_in_java;

import java.util.Comparator;

public class Fruit2 {
  public static Comparator<Fruit2> nameComparator = new Comparator<Fruit2>() {
    public int compare(Fruit2 fruit1, Fruit2 fruit2) {
      return fruit1.name.compareTo(fruit2.name);
    }
  };
  public static Comparator<Fruit2> quantityComparator = new Comparator<Fruit2>() {
    public int compare(Fruit2 fruit1, Fruit2 fruit2) {
      return fruit1.quantity - fruit2.quantity;
    }
  };
  private String name;
  private int quantity;

  public Fruit2(String name, int quantity) {
    this.name = name;
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return name + " " + quantity;
  }
}
