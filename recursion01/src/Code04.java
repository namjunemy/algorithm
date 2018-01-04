public class Code04 {
  public static void main(String[] args) {
    int result = gcd(12, 6);
    System.out.println("최대공약수: " + result);
    result = euclidGcd(12, 6);
    System.out.println("유클리드 호제법 최대공약수: " + result);
    result = lcm(12, 8);
    System.out.println("최소공배수: " + result);
  }

  private static int gcd(int m, int n) {
    if (m < n) {
      int tmp = m;
      m = n;
      n = tmp;
    }
    if (m % n == 0)
      return n;
    else
      return gcd(n, m % n);
  }

  private static int euclidGcd(int p, int q) {
    if (q == 0)
      return p;
    else
      return euclidGcd(q, p % q);
  }

  private static int lcm(int m, int n) {
    int bigger = 0;
    bigger = (m > n) ? m : n;
    while (true) {
      if ((bigger % m == 0) && (bigger % n == 0))
        return bigger;
      bigger++;
    }
  }
}
