import java.util.*;

class Complex {

    private int x, y;

    Complex(int a, int b) {
        x = a;
        y = b;
    }

    Complex add(Complex c, Complex d) {
        x = c.x + d.x;
        y = c.y + d.y;
        return this;
    }

    void display() {
        System.out.println(x + " + i" + y);
    }

}

class CompexNos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter 2nd number:");

        int c = sc.nextInt();
        int d = sc.nextInt();

        Complex f = new Complex(a, b);
        Complex e = new Complex(c, d);
        Complex g = new Complex(0, 0);
        sc.close();
        g.add(e, f);
        g.display();
    }

}