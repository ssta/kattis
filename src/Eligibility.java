import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by ssta on 21/04/16.
 */
public class Eligibility {
  public static void main(String[] args) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < n; i++) {
      String line = sc.nextLine();
      String[] parts = line.split(" ");
      String name = parts[0];
      Date edDate = sdf.parse(parts[1]);
      Date dob = sdf.parse(parts[2]);
      int courses = Integer.parseInt(parts[3]);
      String outcome = "coach petitions";
      if (edDate.getYear() >= 110) {
        outcome = "eligible";
      } else if (dob.getYear() >= 91) {
        outcome = "eligible";
      } else if (courses > 40) {
        outcome = "ineligible";
      }
      System.out.printf("%s %s\n", name, outcome);
    }
  }
}
