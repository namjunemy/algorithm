public class ReverseCharsPrintEx {
  public static void main(String[] args) {
    printCharsReverse("Java, Algorithm");
  }

  private static void printCharsReverse(String str) {
    if (str.equals(""))
      return;
    else {
      printCharsReverse(str.substring(1));
      System.out.print(str.charAt(0));
    }
  }
}
