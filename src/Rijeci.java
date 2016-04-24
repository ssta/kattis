import java.util.Scanner;

/**
 * Created by ssta on 22/04/16.
 */
public class Rijeci {
  public static void main(String[] args) {
    // eek!  After a slow as SHIT attempt to brute force it, I realise that it's just fibonacci numbers f(n-1) and f(n)
    // where f(0)=0 and f(1)=1
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    long[] l = fib(t);
    System.out.printf("%d %d\n", l[0], l[1]);
  }

  /* Return the nth and n+1th fibonacci numbers in a two element array */
  static long[] fib(long n) {
    long[] l = new long[2];
    l[0] = 0;
    l[1] = 1;
    for (int i = 1; i < n; i++) {
      long t = l[0] + l[1];
      l[0] = l[1];
      l[1] = t;
    }
    return l;
  }
}
