
import java.util.Scanner;

public class SumOfseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s = 0;
        int x = 1;
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        for (x = 1; x <= n; x++) {

            s = s + (1 / (Math.pow(x, 2)));

        }
        System.out.println("Sum of series is " + (s));
    }
}