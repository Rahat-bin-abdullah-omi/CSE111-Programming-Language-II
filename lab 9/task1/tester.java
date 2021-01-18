import java.util.Scanner;
public class tester{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the Radius of the Circle");
    
    double a=sc.nextDouble();
    circle c1=new circle(a); 
    System.out.println("The Area of the Circle is :"+c1.space());
    
    
    System.out.println("Enter the radius of sphere:");
    
    double b=sc.nextDouble();
    sphere s1=new sphere(b);
    System.out.println("The volume of the sphere is :"+s1.space());
    sc.close();
  }
}