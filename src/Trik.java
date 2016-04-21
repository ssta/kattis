import java.util.Scanner;

public class Trik {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String moves = sc.nextLine();
    boolean[] cups = new boolean[3];
    cups[0] = true;
    boolean t;
    for (char c : moves.toCharArray()) {
      switch (c) {
        case 'A':
          t = cups[0];
          cups[0] = cups[1];
          cups[1] = t;
          break;
        case 'B':
          t = cups[1];
          cups[1] = cups[2];
          cups[2] = t;
          break;
        case 'C':
          t = cups[0];
          cups[0] = cups[2];
          cups[2] = t;
          break;
      }
    }
    for (int i = 0; i < cups.length; i++) {
      if (cups[i]) {
        System.out.println(i + 1);
      }
    }
  }
}
