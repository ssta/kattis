import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ssta on 23/04/16.
 */
public class HittingTargets {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int targets = sc.nextInt();
    List<Shape> shapes = new ArrayList<>();
    for (int i = 0; i < targets; i++) {
      String s = sc.next();
      if ("circle".equalsIgnoreCase(s)) {
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double r = sc.nextDouble();

        // calculate the bounding rectangle's location...
        double w = 2 * r;
        double h = w;
        double xr = x - r;
        double yr = y - r;
        Ellipse2D circ = new Ellipse2D.Double(xr, yr, w, h);
        shapes.add(circ);
      } else {
        // it's a rectangle...
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double w = x2 - x1;
        double h = y2 - y1;
        Rectangle2D rect = new Rectangle2D.Double(x1, y1, w, h);
        shapes.add(rect);
      }
    }
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int count = 0;
      double x = sc.nextDouble();
      double y = sc.nextDouble();
      for (Shape s : shapes) {
        if (s.contains(x, y)) {count++;}
      }
      System.out.println(count);
    }
  }
}
