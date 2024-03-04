import java.util.*;

public class Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter side 1: ");
        a = sc.nextInt();
        System.out.println("Enter side 2: ");
        b = sc.nextInt();
        c = Math.sqrt((a * a) + (b * b));
        System.out.printf("Hypotenuse is %.2f", c);
        sc.close();
    }
}
