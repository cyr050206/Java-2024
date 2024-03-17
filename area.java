import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = sc.nextDouble();
        final double PI = 3.141529;
        double area = PI * radius * radius;
        System.out.println("Area is " + area);
        sc.close();

    }
}
