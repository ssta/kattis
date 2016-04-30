import java.util.Scanner;

/**
 * Created by ssta on 22/04/16.
 */
public class SecretMessage {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < t; i++) {
      String message = sc.nextLine();
      // how big?
      int N = (int) Math.round(Math.ceil(Math.sqrt(message.length())));
      char[][] chars = new char[N][N];
      // initialize...
      int sp = 0;
      for (int c = 0; c < chars.length; c++) {
        for (int r = 0; r < chars.length; r++) {
          if (sp < message.length()) {
            chars[c][r] = message.charAt(sp);
            sp++;
          } else {
            chars[c][r] = '*';
          }
        }
      }

      chars = rotateMatrix(chars);
      // output
      StringBuilder sb = new StringBuilder();
      for (char[] aChar : chars) {
        for (int r = 0; r < chars.length; r++) {
          if (aChar[r] != '*') {
            sb.append(aChar[r]);
          }
        }
      }

      System.out.println(sb.toString());
    }
  }

  /* Code I stoled from somewhere - I don't recall where now, it was a long time ago in a galaxy far far away... */
  public static char[][] rotateMatrix(char[][] matrix) {
    int w = matrix.length;
    int h = matrix[0].length;
    char[][] ret = new char[h][w];
    for (int i = 0; i < h; ++i) {
      for (int j = 0; j < w; ++j) {
        ret[i][j] = matrix[w - j - 1][i];
      }
    }
    return ret;
  }
}
