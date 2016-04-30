import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ssta on 30/04/16.
 */
public class SymmetricOrder {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int set = 0;
    while (true) {
      int n = sc.nextInt();
      if (n == 0) {break;}
      set++;
      System.out.printf("SET %d%n", set);
      List<String> l = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        l.add(sc.next());
      }
      String[] strings = l.toArray(new String[l.size()]);
      symPrint(strings);
    }

  }

  static void symPrint(String[] s) {
    for (int i = 0; i < s.length; i += 2) {
      System.out.println(s[i]);
    }
    int parity = s.length % 2;
    switch (parity) {
      case 0: {
        for (int i = s.length - 1; i > 0; i -= 2) {
          System.out.println(s[i]);
        }
        break;
      }
      case 1: {
        for (int i = s.length - 2; i > 0; i -= 2) {
          System.out.println(s[i]);
        }
        break;
      }
    }
  }
}
