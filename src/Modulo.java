import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by ssta on 21/04/16.
 */
public class Modulo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Set<Integer> seen = new HashSet<>();
    for (int i = 0; i < 10; i++) {
      seen.add(sc.nextInt() % 42);
    }
    System.out.println(seen.size());
  }
}
