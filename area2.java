import java.util.Scanner;

public class area2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, b;
        int s;
        System.out.println("Enetr length and breadth of rectangle: ");
        l = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enyer side of square: ");
        s = sc.nextInt();
        Rectangle rec = new Rectangle(l, b);
        Rectangle rec2 = new Rectangle(s);
        System.out.println("1:  Rectangle");
        System.out.println("2:  Square");
        int ch = sc.nextInt();
        if (ch == 1) {
            rec.display();
        }
        if (ch == 2) {
            rec2.display();
        }
        sc.close();
    }
}

class Rectangle {
    int length, breadth;
    int side;
    int area;

    Rectangle() {
    };

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        this.area = length * breadth;
    }

    Rectangle(int side) {
        this.side = side;
        this.area = side * side;
    }

    void display() {
        System.out.println("The area is " + area);
    }

}
