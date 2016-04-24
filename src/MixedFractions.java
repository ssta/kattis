import java.util.Scanner;

/**
 * Created by ssta on 22/04/16.
 */
public class MixedFractions {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      if (b == 0) break;
      int i = a / b;
      int n = a % b;
      System.out.printf("%d %d / %d\n", i, n, b);
    }
  }
}
