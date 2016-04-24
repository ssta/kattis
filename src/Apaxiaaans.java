import java.util.Scanner;

/**
 * Created by ssta on 21/04/16.
 */
public class Apaxiaaans {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    name = name.replaceAll("(.)\\1{1,}", "$1");
    System.out.println(name);
  }
}
