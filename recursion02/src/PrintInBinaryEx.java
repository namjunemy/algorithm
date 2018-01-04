public class PrintInBinaryEx {
  public static void main(String[] args) {
    printInBinary(10);
  }

  private static void printInBinary(int n) {
    if (n < 2)
      System.out.print(n);
    else {
      printInBinary(n / 2);
      System.out.print(n % 2);
    }
  }
}
