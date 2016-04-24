import java.util.Scanner;

/**
 * Created by ssta on 23/04/16.
 */
public class Aaah {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String jon = sc.nextLine();
    String doc = sc.nextLine();
    String response = (jon.length() < doc.length()) ? "no" : "go";
    System.out.println(response);
  }
}
