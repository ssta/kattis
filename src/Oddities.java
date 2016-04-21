import java.util.Scanner;

/**
 * Created by ssta on 21/04/16.
 */
public class Oddities {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cases = sc.nextInt();
    for (int i = 0; i < cases; i++) {
      int n = sc.nextInt();
      String s = (n % 2 == 0) ? "even" : "odd";
      System.out.printf("%d is %s%n", n, s);
    }
  }
}
