public class StringLengthEx {
  public static void main(String[] args) {
    System.out.println("JAVA의 길이: " + length("JAVA"));
  }

  private static int length(String str) {
    if (str.equals(""))
      return 0;
    else
      return 1 + length(str.substring(1));
  }
}
