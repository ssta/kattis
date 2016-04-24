import java.util.Scanner;

/**
 * Created by ssta on 23/04/16.
 */
public class AlphabetSpam {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    int w = 0;
    int l = 0;
    int u = 0;
    int s = 0;
    for (char c : line.toCharArray()) {
      if (c == '_') { w++; } else if (c >= 'a' && c <= 'z') { l++; } else if (c >= 'A' && c <= 'Z') { u++; } else {s++;}
    }
    double total = w + l + u + s;
    System.out.printf("%.7f\n%.7f\n%.7f\n%.7f\n",
        w / total, l / total, u / total, s / total
    );
  }
}
