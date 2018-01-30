package sorting_in_java;

public class Fruit implements Comparable<Fruit> {
  public String name;
  public int quantity;

  public Fruit(String name, int quantity) {
    this.name = name;
    this.quantity = quantity;
  }

  @Override
  public int compareTo(Fruit other) {
    //return name.compareTo(other.name);
    return quantity - other.quantity;
  }

  @Override
  public String toString() {
    return name + " " + quantity;
  }
}