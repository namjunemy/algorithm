public class SumArrayEx {
  public static void main(String[] args) {
    int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println("합: " + sum(10, data));
  }

  private static int sum(int n, int[] data) {
    if (n <= 0)
      return 0;
    else
      return sum(n - 1, data) + data[n - 1];
  }
}
