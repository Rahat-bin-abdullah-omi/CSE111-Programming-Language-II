import java.util.Scanner;
public class task5 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter voltage (volts)");
    double E=sc.nextDouble();
    System.out.println("Enter resistance (ohms)");
    double R=sc.nextDouble();
    System.out.println("Enter inductance (henrys)");
    double L=sc.nextDouble();
    System.out.println("Enter capacitance (farads)"); 
    double C=sc.nextDouble();
    System.out.println("Enter frequency (hertz)");
    double f=sc.nextDouble();
    double pi=Math.PI;
    double I=E/Math.pow(Math.pow(R,2)+Math.pow(((2.0*pi*f*L)-(1.0/(2.0*pi*f*C))),2),-1.0/2.0);
    System.out.println("The value of I(current) is = "+I);
    sc.close();
  }
}