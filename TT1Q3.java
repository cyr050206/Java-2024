import java.util.Scanner;
import java.io.*;
//import java.lang.*;

public class TT1Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user: ");
        String a = sc.nextLine();
        boolean isNumeric = isNumeric(a);

        if (isNumeric) {
            int b = Integer.parseInt(a);
            typegame(b);
        } else {
            typegame(a);
        }
        // String a=String.parse(args[0]);

    }

    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    static void typegame(int a) {
        System.out.println("This is integer!");

    }

    static void typegame(String a) {
        System.out.println("This is String!");
    }
}
