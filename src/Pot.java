import java.util.Scanner;

/**
 * Created by ssta on 30/04/16.
 */
public class Pot {
  public static void main(String[] args) {
    // if I'm reading the problem properly (I may not be), looks like I need to take each number in the input and strip the last digit from it,
    // using it as a power - then add up the results...
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long sum = 0;
    for (int i = 0; i < n; i++) {
      String s = sc.next();
      int number = Integer.parseInt(s.substring(0, s.length() - 1));
      int pow = Integer.parseInt(s.substring(s.length() - 1));
      sum += Math.pow(number, pow);
    }
    System.out.println(sum);
  }
}
