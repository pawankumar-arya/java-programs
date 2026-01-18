import java.util.Scanner;

public class FindDays {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int year = sc.nextInt();

    if (n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12) {
      System.out.println("31 Days ");
    } else if (n == 4 || n == 6 || n == 9 || n == 11) {
      System.out.println("30 days ");
    } else if (n == 2 && year % 4 == 0) {
      System.out.println("29 days ");
    } else if (n == 2) {
      System.out.println("28 Days ");
    } else {
      System.out.println("Invalid Input");
    }
  }
}
