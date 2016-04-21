import java.util.Scanner;

/**
 * Created by ssta on 20/04/16.
 */
public class Carrots {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String[] l = line.split(" ");
    int people = Integer.parseInt(l[0]);
    int carrots = Integer.parseInt(l[1]);
    for (int i = 0; i < people; i++) {
      sc.nextLine();
    }
    System.out.println(carrots);
  }
}
