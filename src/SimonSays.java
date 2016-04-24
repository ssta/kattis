import java.util.Scanner;

/**
 * Created by ssta on 22/04/16.
 */
public class SimonSays {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < t; i++) {
      String line = sc.nextLine();
      if (line.startsWith("Simon says ")) {
        System.out.println(line.substring(10));
      }
    }
  }
}
