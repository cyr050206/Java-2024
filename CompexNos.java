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
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = sc.nextInt();
        int d = sc.nextInt();

        Complex f = new Complex(a, b);
        Complex e = new Complex(c, d);
        Complex g = new Complex(0, 0);
        g = g.add(e, f);
        g.display();
    }

}