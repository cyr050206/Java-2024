import java.util.*;

public class StringFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int space = 0, upper = 0, lower = 0, number = 0;
        System.out.println("Enter name: ");
        name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) {
            char x = name.charAt(i);
            if (x == ' ') {
                space++;
            }
            if (x >= 65 && x <= 90) {
                upper++;
            }
            if (x >= 97 && x <= 122) {
                lower++;
            }
            if (Character.isDigit(x) == true) {
                number++;
            }
        }
        System.out.println("Space = " + space);
        System.out.println("Lower = " + lower);
        System.out.println("Upper = " + upper);
        System.out.println("number = " + number);
    }
}
