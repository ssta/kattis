import java.util.Scanner;

public class ReverseBinary {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String b = Integer.toBinaryString(num);
    b = new StringBuilder(b).reverse().toString();
    int newNum = Integer.parseInt(b, 2);
    System.out.println(newNum);
  }

}
