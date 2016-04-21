import java.util.Scanner;

/**
 * Created by ssta on 21/04/16.
 */
public class Pet {
  public static void main(String[] args) {
    int bestScore = 0;
    int bestCook = 0;
    Scanner sc = new Scanner(System.in);
    for (int cook = 1; cook <= 5; cook++) {
      int score = 0;
      for (int grade = 1; grade <= 4; grade++) {
        score += sc.nextInt();
      }
      if (score > bestScore) {
        bestScore = score;
        bestCook = cook;
      }
    }

    System.out.printf("%d %d", bestCook, bestScore);
  }
}
