import java.util.Scanner;

/**
 * Created by ssta on 23/04/16.
 */
public class DetailedDifferences {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = Integer.parseInt(sc.nextLine());
    for(int i=0; i<t; i++){
      String line1=sc.nextLine();
      String line2=sc.nextLine();
      System.out.println(line1);
      System.out.println(line2);
      for(int j=0; j<line1.length(); j++){
        System.out.print(line1.charAt(j)==line2.charAt(j)?'.':'*');
      }
      System.out.println("\n");
    }
  }
}
