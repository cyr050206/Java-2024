//check if a number is palindrome or not
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int a  = n;
        int p=0;
        while(n!=0){
            int x=n%10;
            p = p*10+x;
            n/=10;
        }
        if(a == p){
            System.out.println("Palindrome! ");
            
        }else{
            System.out.println("Not Palindrome! ");
        }
        sc.close();
    }
}
