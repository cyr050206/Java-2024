
//program to reverse a string: 
import java.util.*;

public class strrev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String x[] = {};
        String n = sc.next();
        // String p =n;
        for (int i = n.length()+1; i >= 0; i--) {
            char ch = n.charAt(i);
            x[i] = x[i] + ch;

        }
        System.out.println("Reversed String is " + x);
        sc.close();
    }
}
