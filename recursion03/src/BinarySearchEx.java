public class BinarySearchEx {
  public static void main(String[] args) {
    String[] strings = {"a", "b", "c", "d", "e"};
    System.out.println("search index: " + binarySearch(strings, "c", 0, strings.length));
  }

  public static int binarySearch(String[] items, String target, int begin, int end) {
    if (begin > end)
      return -1;
    else {
      int middle = (begin + end) / 2;
      int compResult = target.compareTo(items[middle]);
      if (compResult == 0)
        return middle;
      else if (compResult < 0)
        return binarySearch(items, target, begin, middle - 1);
      else
        return binarySearch(items, target, middle - 1, end);
    }
  }
}
