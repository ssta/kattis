import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by ssta on 21/04/16.
 */
public class Everywhere {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int t = 0; t < T; t++) {
      int n = sc.nextInt();
      // nextInt() doesn't go to the new line, so need this to avoid getting an empty string as the first 'line'
      sc.nextLine();
      Set<String> cities = new HashSet<>();
      for (int i = 0; i < n; i++) {
        cities.add(sc.nextLine());
      }
      System.out.println(cities.size());
    }
  }
}
