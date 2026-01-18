import java.util.Scanner;
public class Cal_Perc_Grade {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Physics: ");
    int phy=sc.nextInt();
    System.out.print("Chemistry: ");
    int chem=sc.nextInt();
    System.out.print("Biology: ");
    int bio=sc.nextInt();
    System.out.print("Mathematics: ");
    int math=sc.nextInt();
    System.out.print("Computer: ");
    int comp=sc.nextInt();
    int totalMarks=phy+chem+bio+math+comp;
    double percentage=(totalMarks/500.0)*100;
    System.out.println("Percentage: "+percentage);
    if(percentage>=90){
      System.out.println("Grade: A");
    }else if(percentage>=80){
      System.out.println("Grade: B");
    }else if(percentage>=70){
      System.out.println("Grade: C");
    }else if(percentage>=60){
      System.out.println("Grade: D");
    }else if(percentage>=40){
      System.out.println("Grade: E");
    }else{
      System.out.println("Grade: F");
    }
    
  }
}
