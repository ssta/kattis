import java.util.Scanner;

/**
 * Created by ssta on 22/04/16.
 */
public class ReverseRot {
  public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      int n = sc.nextInt();
      if (n == 0) break;
      String word = sc.next();
      System.out.println(rot(n, word));
    }
  }

  static String rot(int n, String message) {
    StringBuilder sb = new StringBuilder();
    for (char c : message.toCharArray()) {
      sb.append(ALPHABET.charAt((ALPHABET.indexOf(c) + n) % ALPHABET.length()));
    }
    return sb.reverse().toString();
  }
}
