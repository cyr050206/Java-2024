/*Adwita , 8th Grade student wants to write 
a function to calculate simple interest, compound
 interest. She wants to keep same (final) rate of interest
  for every input of principal and time. 
  She wants to ensure that the declared functions are 
  not overridden in any subclasses and the class is not 
  inherited by any other class. Help her to declare the 
  variables methods and classes and write the code for the 
  same using final keyword.*/
import java.util.Scanner;
public class intrest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        final double r = 2.5;
        System.out.println("Enter principal: ");
        int p = sc.nextInt();
        System.out.println("Enter time: ");
        int t = sc.nextInt();
        Calculator calculator = new Calculator();
        double simpleIntrest = calculator.SimpleCalculate(p, r, t);
        System.out.println("Simple Inrest = "+simpleIntrest);
        double compound = calculator.CompoundCalculate(p, r, t);
        System.out.printf("Compound Intrest = %.3f", compound);
        sc.close();
    }
}
class Calculator{
    double SimpleCalculate(int p, final double r, int t){
        return (p*r*t)/100;
    }
    double CompoundCalculate(int p, final double r, int t){
        return p* (Math.pow(1+(r/100),t))-p;
    }
}
