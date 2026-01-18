public class Young_of_Three {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int c = 15;

    if (a < b) {
      if (a < c) {
        System.out.println("Youngest is: " + a);
      } else {
        System.out.println("Youngest is: " + c);
      }
    } else {
      if (b < c) {
        System.out.println("Youngest is: " + b);
      } else {
        System.out.println("Youngest is: " + c);
      }
    }
  }
}
