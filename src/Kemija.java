import java.util.Scanner;

/**
 * Created by ssta on 21/04/16.
 */
public class Kemija {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    StringBuilder sb = new StringBuilder();
    char[] chars = line.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      char c = chars[i];
      sb.append(c);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {i += 2;}
    }
    System.out.println(sb.toString());
  }
}
