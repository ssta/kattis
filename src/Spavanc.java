import java.util.Scanner;

public class Spavanc {
  public static void main(String[] args) {
    final int MINS_IN_DAY = 60 * 24;
    final int MINS_IN_HOUR = 60;

    Scanner sc = new Scanner(System.in);
    int hours = sc.nextInt();
    int mins = sc.nextInt();

    int alarmMins = (hours * MINS_IN_HOUR) + mins;
    int newMins = (alarmMins + MINS_IN_DAY - 45) % MINS_IN_DAY;
    int newHours = newMins / MINS_IN_HOUR;
    newMins %= MINS_IN_HOUR;
    System.out.println(String.format("%d %d", newHours, newMins));
  }
}
