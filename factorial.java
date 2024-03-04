import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        System.out.println("Fact is " + fact(a));
        scanner.close();
    }

    static int fact(int a) {
        if (a == 0) {

            return 1;
        } else {
            return a * fact(a - 1);
        }
    }
}
