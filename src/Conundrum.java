import java.util.Scanner;

/**
 * Created by ssta on 21/04/16.
 */
public class Conundrum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ct = sc.nextLine();
    char[] chars = ct.toCharArray();
    char[] per = "PER".toCharArray();
    int count = 0;
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] != per[i % 3]) {
        count++;
      }
    }
    System.out.println(count);
  }
}
