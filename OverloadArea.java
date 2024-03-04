import java.util.*;

public class OverloadArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square");
        int a = sc.nextInt();
        System.out.println("Enter 1st side of rect");
        int b = sc.nextInt();
        System.out.println("Enter 2nd side of rect");
        int c = sc.nextInt();
        area(c, b);
        area(a);
    }

    static void area(int a, int b) {
        double area = a * b;
        System.out.println("The area of rect is " + area);
    }

    static void area(int a) {
        double area = a * a;
        System.out.println("The area of square is " + area);
    }
}
