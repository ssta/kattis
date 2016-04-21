import java.util.Scanner;

/**
 * Created by ssta on 21/04/16.
 */
public class Pizza2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int rminusc = r - c;
    double smallArea = Math.PI * rminusc * rminusc;
    double bigArea = Math.PI * r * r;
    double pctCheese = (smallArea / bigArea) * 100;
    System.out.println(String.format("%.9f",pctCheese));
  }
}
