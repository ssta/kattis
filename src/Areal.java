import java.util.Scanner;

/**
 * Created by ssta on 23/04/16.
 */
public class Areal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double area = sc.nextDouble();
    System.out.printf("%.7f\n",(4* Math.sqrt(area)));
  }
}
