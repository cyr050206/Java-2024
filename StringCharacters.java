
import java.util.Scanner;

public class StringCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter a String: ");
        String s = sc.next();
        System.out.println("Enter the char to check: ");
        String c = sc.next();
        for (int i = 0; i < s.length(); i++) {
            // char x = s.charAt(i);
            if ((s.substring(i, 1 + i)).equalsIgnoreCase(c)) {
                count++;
            }
        }
        System.out.println("The no. of times " + c + " has been seen in " + s + " is " + count);
        sc.close();
    }
}
