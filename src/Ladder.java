import java.util.Scanner;

/**
 * Created by ssta on 21/04/16.
 */
public class Ladder {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();
    int v = sc.nextInt();
    double vr = Math.PI * v / 180.0;
    // sin xc = O/H
    // H=O/sin xc
    System.out.println((int) Math.ceil(h / Math.sin(vr)));
  }
}
