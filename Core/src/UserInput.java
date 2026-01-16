import java.util.*;
public class UserInput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name=sc.nextLine();
        System.out.println("Enter Your Password: ");
        String password=sc.nextLine();
        System.out.println("Enter Your Confirm Password: ");
        String confirmPassword=sc.nextLine();
        System.out.println("Your Name: "+name);
        System.out.println("Your Password: "+password);
    }
}
