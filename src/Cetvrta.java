import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by ssta on 23/04/16.
 */
public class Cetvrta {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Map<Integer, Integer> xmap = new HashMap<>();
    Map<Integer, Integer> ymap = new HashMap<>();
    for (int i = 0; i < 3; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      if (xmap.containsKey(x)) { xmap.put(x, 2); } else { xmap.put(x, 1);}
      if (ymap.containsKey(y)) { ymap.put(y, 2); } else { ymap.put(y, 1);}
    }
    xmap.keySet().stream().filter(k -> xmap.get(k) == 1).forEach(k -> {
      System.out.printf("%d ", k);
    });
    ymap.keySet().stream().filter(k -> ymap.get(k) == 1).forEach(k -> {
      System.out.printf("%d\n", k);
    });
  }
}