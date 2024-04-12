import java.util.Scanner;

public class area2 {
    public static void main(String[] args) {
        System.out.println("Hello!");
        Scanner sc = new Scanner(System.in);
        int l, b;
        int s;
        System.out.println("Enetr length and breadth of rectangle: ");
        l = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter side of square: ");
        s = sc.nextInt();
      //  Rectangle rec;
       // Rectangle rec2 = new Rectangle(s);
        System.out.println("1:  Rectangle");
        System.out.println("2:  Square");
        int ch = sc.nextInt();
        if (ch == 1) {
            new Rectangle(l,b).display();
        }
        if (ch == 2) {
            new Rectangle(s).display();
        }
        sc.close();
    }
}

class Rectangle {
    int Cyrus, Alice =0;
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
      //  Rectangle x= ;
        System.out.println("The area is " + area);
        //return x ;
    }

}
