public class Selection {
  private static int[] input = {5, 6, 2, 8, 7, 23, 4, 1};

  public static void main(String[] args) {
    selectionSortMin(input, input.length);
    for (int a : input) {
      System.out.print(a + " ");
    }
  }

  private static void selectionSortMin(int[] input, int length) {
    int min;
    int tmp;
    for (int i = 0; i < length - 1; i++) {
      min = i;
      for (int j = i + 1; j < length; j++) {
        if (input[j] < input[min])
          min = j;
      }
      tmp = input[i];
      input[i] = input[min];
      input[min] = tmp;
    }
  }

  private static void selectionSortMax(int[] input, int length) {
    int max;
    int tmp;
    for (int i = length - 1; i > 0; i--) {
      max = i;
      for (int j = i -1; j >= 0; j--) {
        if (input[j] > input[max])
          max = j;
      }
      tmp = input[i];
      input[i] = input[max];
      input[max] = tmp;
    }
  }
}
