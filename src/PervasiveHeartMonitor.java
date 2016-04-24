import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by ssta on 23/04/16.
 */
public class PervasiveHeartMonitor {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextLine()) {
      String line = sc.nextLine();
      String[] parts = line.split(" ");
      List<Double> rates = new ArrayList<>();
      List<String> names = new ArrayList<>();
      for (int i = 0; i < parts.length; i++) {
        // hate using exceptions like this!
        try {
          rates.add(Double.parseDouble(parts[i]));
        } catch (NumberFormatException nfe) {
          names.add(parts[i]);
        }
      }
      double average = average(rates);
      String name = names.stream().collect(Collectors.joining(" "));
      System.out.printf("%.4f %s\n", average, name);
    }
  }

  static double average(List<Double> list) {
    double sum = list.stream().mapToDouble(d -> d).sum();
    return sum / list.size();
  }


}
