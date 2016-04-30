import java.util.Scanner;

/**
 * Created by ssta on 24/04/16.
 */
public class Bijjele {
  static final int[] targets = new int[]{1, 1, 2, 2, 2, 8};

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 6; i++) {
      int p = sc.nextInt();
      System.out.printf("%d", targets[i] - p);
      if (i != 5) System.out.printf(" ");
    }
    System.out.println();
  }
}
