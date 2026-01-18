public class UserInput {
  public static void main(String[] args) {
      // Prompt the user for input
      try ( // Create a Scanner object to read user input
              java.util.Scanner scanner = new java.util.Scanner(System.in)) {
          // Prompt the user for input
          System.out.print("Enter your name: ");
          String name = scanner.nextLine();
          System.out.print("Enter your age: ");
          int age = scanner.nextInt();
          // Print the user's input
          System.out.println("Hello, " + name + "! You are " + age + " years old.");
          // Close the scanner
      }
  }
}