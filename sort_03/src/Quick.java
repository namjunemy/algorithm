import java.util.Arrays;

public class Quick {
  public static void main(String[] args) {
    int[] a = {5, 3, 6, 7, 8, 11, 23, 2, 9};
    quickSort(a, 0, a.length - 1);
    Arrays.stream(a).forEach(s -> System.out.print(s + " "));
  }

  private static void quickSort(int[] a, int begin, int end) {
    if (begin >= end)
      return;
    else {
      int newPivot = partition(a, begin, end);
      quickSort(a, begin, newPivot - 1);
      quickSort(a, newPivot, end);
    }
  }

  private static int partition(int[] a, int begin, int end) {
    int pivot = a[end];
    int i = begin - 1;
    for (int j = begin; j < end; j++) {
      if (a[j] <= pivot) {
        i++;
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
      }
    }
    int tmp = a[i + 1];
    a[i + 1] = a[end];
    a[end] = tmp;
    return i + 1;
  }
}