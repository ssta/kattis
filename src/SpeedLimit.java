import java.util.Scanner;

public class SpeedLimit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      int lines = sc.nextInt();
      if (lines < 0) {break;}
      int c = 0;
      int dist = 0;
      for (int i = 0; i < lines; i++) {
        int speed = sc.nextInt();
        int time = sc.nextInt();
        dist += speed * (time - c);
        c = time;
      }
      System.out.println(String.format("%d miles", dist));
    }
  }
}
