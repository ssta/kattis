import java.util.Scanner;

/**
 * Created by ssta on 23/04/16.
 */
public class QuickBrownFox {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < t; i++) {
      String line = sc.nextLine();
      pangram(line);
    }
  }

  private static void pangram(String line) {
    line = line.toLowerCase();
    boolean pangram = true;
    for (char c = 'a'; c <= 'z'; c++) {
      if (line.indexOf(c) < 0) {
        if (pangram) {
          System.out.print("missing ");
          pangram = false;
        }
        System.out.print(c);
      }
    }
    if (pangram) {
      System.out.print("pangram");
    }
    System.out.println();
  }
}
