public class Insertion {
  private static int[] input = {5, 6, 2, 8, 7, 23, 4, 1, 44};

  public static void main(String[] args) {
    insertionSort(input, input.length);
    for (int a : input) {
      System.out.print(a + " ");
    }
  }

  private static void insertionSort(int[] input, int length) {
    int tmp;
    for (int i = 1; i < length; i++) {
      for (int j = i; j > 0; j--) {
        if (input[j - 1] > input[j]) {
          tmp = input[j - 1];
          input[j - 1] = input[j];
          input[j] = tmp;
        }
      }
    }
  }
}
