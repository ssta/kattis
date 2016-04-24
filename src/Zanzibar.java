import java.util.Scanner;

/**
 * Created by ssta on 22/04/16.
 */
public class Zanzibar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < t; i++) {
      String line = sc.nextLine();
      long lastYear = 1;
      String[] years = line.split(" ");
      long bound = 0;
      for (int j = 0; (j < years.length) && (Long.parseLong(years[j]) > 0); j++) {
        long thisYear = Long.parseLong(years[j]);
        if (lastYear * 2 < thisYear) {
          bound += thisYear - (lastYear * 2);
        }
        lastYear = Long.parseLong(years[j]);
      }
      System.out.println(bound);
    }
  }
}
