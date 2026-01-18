public class MultipleOf_5_7 {
  public static void main(String[] args) {
    int number = 35;
    if (number % 5 == 0 && number % 7 == 0) {
      System.out.println(number + " is a multiple of both 5 and 7.");
    } else {
      System.out.println(number + " is not a multiple of both 5 and 7.");
    }
  }
}