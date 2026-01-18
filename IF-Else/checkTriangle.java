public class checkTriangle{
  public static void main(String[] args) {
    int x = 1 ;
    int y = 2 ;
    int z = 3 ;
    if(x==y && y==z){
      System.out.println("Equilateral Triangle");
    }else if(x==y || y==z || z==x){
      System.out.println("Isosceles Triangle");
    }else{
      System.out.println("Scalene Triangle");
    }
  }
}