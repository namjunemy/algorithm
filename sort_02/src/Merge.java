public class Merge {
  private static int[] input = {5, 6, 2, 8, 7, 23, 4, 1};

  public static void main(String[] args) {
    sort(input, 0, input.length - 1);
    for (int a : input) {
      System.out.print(a + " ");
    }
  }

  private static void sort(int[] data, int p, int r) {
    int q;
    if (p >= r)
      return;
    else {
      q = (p + r) / 2;
      sort(data, p, q);
      sort(data, q + 1, r);
      merge(data, p, q, r);
    }
  }

  private static void merge(int[] data, int p, int q, int r) {
    int i = p;
    int j = q + 1;
    int k = p;
    int[] tmp = new int[data.length];
    while (i <= q && j <= r) {
      if (data[i] <= data[j])
        tmp[k++] = data[i++];
      else
        tmp[k++] = data[j++];
    }
    while (i <= q)
      tmp[k++] = data[i++];
    while (j <= r)
      tmp[k++] = data[j++];
    for (int a = p; a <= r; a++)
      data[a] = tmp[a];
  }
}
