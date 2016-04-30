import java.util.*;

/**
 * Created by ssta on 24/04/16.
 */
public class NotAmused {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int day = 1;
    Map<String, Integer> entry = new HashMap<>();
    Map<String, Integer> duration = new HashMap<>();
    while (sc.hasNextLine()) {
      String line = sc.nextLine();
      if ("OPEN".equals(line)) {
        // empty the maps
        entry.clear();
        duration.clear();
      } else if ("CLOSE".equals(line)) {
        output(day, duration);
        day++;
      } else if (line.startsWith("ENTER")) {
        String[] parts = line.split(" ");
        entry.put(parts[1], Integer.valueOf(parts[2]));
      } else {
        // EXIT
        String[] parts = line.split(" ");
        int d = Integer.parseInt(parts[2]) - entry.get(parts[1]);
        if (duration.containsKey(parts[1])) {
          duration.put(parts[1], d + duration.get(parts[1]));
        } else {
          duration.put(parts[1], d);
        }
        entry.remove(parts[1]);
      }
    }

  }

  private static void output(int day, Map<String, Integer> duration) {
    SortedSet<String> names = new TreeSet<>(duration.keySet());
    System.out.printf("Day %d%n", day);
    for (String name : names) {
      double cost = 0.1 * duration.get(name);
      System.out.printf("%s $%.2f\n", name, cost);
    }
    System.out.println();
  }
}
