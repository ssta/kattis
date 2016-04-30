import java.util.Scanner;

/**
 * Created by ssta on 24/04/16.
 */
public class Measurement {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // input is <number> <unitfrom> in <unitto>
    int number = sc.nextInt();
    Unit unitFrom = Unit.valueOf(sc.next().toUpperCase());
    sc.next(); // throw away "in"
    Unit unitTo = Unit.valueOf(sc.next().toUpperCase());

    // convert to thou
    long thou = number * unitFrom.factor;
    // convert from thou
    double answer = ((double) thou) / unitTo.factor;
    System.out.printf("%.10f", answer);
  }

  static enum Unit {
    /* Conversion factors (all in thou) */
    THOU(1L),
    TH(1L),
    INCH(TH.factor * 1000),
    IN(TH.factor * 1000),
    FOOT(IN.factor * 12),
    FT(IN.factor * 12),
    YARD(FT.factor * 3),
    YD(FT.factor * 3),
    CHAIN(YD.factor * 22),
    CH(YD.factor * 22),
    FURLONG(CH.factor * 10),
    FUR(CH.factor * 10),
    MILE(FUR.factor * 8),
    MI(FUR.factor * 8),
    LEAGUE(MI.factor * 3),
    LEA(MI.factor * 3);

    long factor;

    Unit(long factor) { this.factor = factor;}
  }
}

