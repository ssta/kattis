import java.util.Scanner;

/**
 * Created by ssta on 25/04/16.
 */
public class BottledUp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int v1 = sc.nextInt();
    int v2 = sc.nextInt();
    int count1 = 0;
    int count2 = 0;

    while (s >= v2) {
      if (s % v1 == 0) {
        break;
      }
      s = s - v2;
      count2++;
    }

    while (s >= v1) {
      s = s - v1;
      count1++;
    }
    if (s != 0) {
      System.out.println("Impossible");
    } else {
      System.out.printf("%d %d", count1, count2);
    }
  }
}
