import java.util.Scanner;

public class returnobj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sides of rectangle");
        int l = sc.nextInt();
        int b = sc.nextInt();
        Rectangle rec = new Rectangle(l, b);
        System.out.println("Enter length of square: ");
        int s = sc.nextInt();
        rec.createSquare(s);
    }
}

class Rectangle {
    Rectangle() {
    };

    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Rectangle createSquare(int s) {
        Rectangle rect = new Rectangle();
        rect.length = s;
        rect.breadth = s;
        rect.display(rect);
        return rect;
    }

    void display(Rectangle re) {
        System.out.println("square with sides " + re.length + " and " + re.breadth);
    }
}
