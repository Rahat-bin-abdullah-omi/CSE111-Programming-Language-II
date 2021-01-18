public class ComplexNumber extends RealNumber {
 public double imaginaryvalue;
 public ComplexNumber(int realvalue, int imaginaryvalue){
   setRealValue(realvalue);
   this.imaginaryvalue = imaginaryvalue;
 }
 
 public ComplexNumber(){
   super(1.0);
   this.imaginaryvalue = 1.0;
 }
 
 public String toString(){
   return super.toString() + "\nImaginaryPart: " + imaginaryvalue; 
 }
 public void check(){
   System.out.println("I'm in ComplexNumber class");
   super.ping(); 
   System.out.println("Checking ended.");
 }
}