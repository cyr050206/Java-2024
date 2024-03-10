import java.util.Scanner;

public class ComplexNos {
    public static void main(String[] args) {
        int r1 = 0, r2 = 0;
        int i1 = 0, i2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part of 1st: ");
        r1 = sc.nextInt();
        System.out.print("Enter imaginary part of 1st: ");
        i1 = sc.nextInt();
        Complex c1 = new Complex(r1, i1);
        System.out.print("Enter real part of 2nd: ");
        r2 = sc.nextInt();
        System.out.print("Enter imaginary part of 2nd: ");
        i2 = sc.nextInt();
        Complex c2 = new Complex(r2, i2);
        System.out.print("Enter 1 for add and 2 for sub: ");
        int ch = sc.nextInt();
        if (ch == 1) {
            c1.add(c1, c2).display();
        }
        if (ch == 2) {
            c1.sub(c1, c2).display();
        }

        sc.close();
    }
}

class Complex {
    int real = 0;
    int im = 0;

    Complex() {
    };

    Complex(int r, int i) {
        real = r;
        im = i;

    }

    Complex add(Complex c1, Complex c2) {
        Complex temp = new Complex();
        temp.real = c1.real + c2.real;
        temp.im = c1.im + c2.im;
        return temp;
    }

    Complex sub(Complex c1, Complex c2) {
        Complex temp = new Complex();
        temp.real = c1.real - c2.real;
        temp.im = c1.im - c2.im;
        return temp;
    }

    void display() {
        System.out.println(real + "" + (im > 0 ? " + " : "") + " " + im + " y");
    }
}
