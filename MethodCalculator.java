import java.util.*;

public class MethodCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ans = 0;
        System.out.print("Enter 1st number: ");
        int a = scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = scanner.nextInt();
        System.out.println("What operation would you like to perform?(+ , - , / , *)");
        char c = scanner.next().charAt(0);
        if (c == '+') {
            ans = add(a, b);
        }
        if (c == '-') {
            ans = sub(a, b);
        }
        if (c == '*') {
            ans = mult(a, b);
        }
        if (c == '/') {
            ans = div(a, b);
        }
        System.out.println("Ans is " + ans);
        scanner.close();
    }

    static int add(int a, int b) {
        int ans = a + b;
        return ans;

    }

    static int sub(int a, int b) {
        int ans = a - b;
        return ans;

    }

    static int mult(int a, int b) {
        int ans = a * b;
        return ans;

    }

    static double div(int a, int b) {
        double ans = (double) a / b;
        return ans;

    }
}
