//import java.util.Scanner;
public class no_of_objects
 {
    public static void main(String[] args) {
        count ob1 = new count();
        count ob2 = new count();
        count ob3 = new count();
        
        count ob4 = new count();
        count ob5 = new count();
        System.out.println("The no. of objects is "+count.display());
    }
}
class count{
    static int c=0;
    count(){
        c++;
    }
    static int display(){
        return c;
    }

}

