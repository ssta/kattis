import java.util.Scanner;

/**
 * Created by ssta on 23/04/16.
 */
public class EstimatingAreaOfCircle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      double r = sc.nextDouble();
      double m = sc.nextDouble();
      double c = sc.nextDouble();
      if (r == 0 && m == 0 && c == 0) { break; }

      double realCircleArea = Math.PI * r * r;
      double areaSquare = 4 * r * r;
      double ratioInCircle = c / m;
      double estimatedCircleArea = areaSquare * ratioInCircle;
      System.out.printf("%.5f %.5f\n", realCircleArea, estimatedCircleArea);
    }
  }
}
