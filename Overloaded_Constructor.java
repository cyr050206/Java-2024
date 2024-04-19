import java.util.*;
public class Overloaded_Constructor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 foe Square");
        System.out.println("Enter 2 for Rectangle");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();
        if(ch==1){
        System.out.print("Enter side: ");
        int s=sc.nextInt();
        Shape ob= new Shape(s);
        ob.display();
        }
        if(ch==2){
            System.out.print("Enter length: ");
            int l=sc.nextInt();
            System.out.print("ENter breadth: ");
            int b=sc.nextInt();
            Shape ob = new Shape(l,b);
            ob.display();
        }
        
    }
}
class Shape{
    int area;
    Shape(int a, int b){
area = a*b;
    }
    Shape(int a){
area = a*a;
    }
    void display(){
System.out.println("Area is "+area);
    }

}
