import java.util.*;

public class SimultaneousEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, d, e, f, De = 0, Dx = 0, Dy = 0;
        double x, y;
        System.out.println("The equations are in the form of \nAx+By=C \n  and\nDx+Ey=f");
        System.out.println("Enter value of A");
        a = scanner.nextDouble();
        System.out.println("Enter value of B");
        b = scanner.nextDouble();
        System.out.println("Enter value of C");
        c = scanner.nextDouble();
        System.out.println("Enter value of D");
        d = scanner.nextDouble();
        System.out.println("Enter value of E");
        e = scanner.nextDouble();
        System.out.println("Enter value of F");
        f = scanner.nextDouble();
        System.out.println("Your equations are \n" + a + "x" + " + " + b + "y = " + c + "\nAnd\n" + d + "x" + " + " + e
                + "y = " + f);
        De = det(a, b, d, e);
        Dx = det(c, b, f, e);
        Dy = det(a, c, d, f);
        System.out.println("Determinant D = " + De);
        System.out.println("Determinant Dx = " + Dx);
        System.out.println("Determinant Dy = " + Dy);
        x = Dx / De;
        y = Dy / De;
        System.out.println("X is " + x);
        System.out.println("Y is " + y);
        scanner.close();
    }

    public static double det(double a, double b, double d, double e) {
        double deter = 0;
        deter = (a * e) - (b * d);

        return deter;
    }
}
