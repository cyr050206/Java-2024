import java.util.*;

public class Dicepassing {
    public static void main(String[] args) {
        Game p1 = new Game();
        Game p2 = new Game();
        p1.accept();
        p2.accept();
        int c = p1.compute();
        int k = p2.compute();
        if (c < k) {
            System.out.println(p1.name + " won!");
        } else {
            System.out.println(p2.name + " won!");
        }
    }
}

class Game {
    String name;
    int age;
    Scanner scanner = new Scanner(System.in);

    void accept() {
        System.out.println("enter the name: ");
        name = scanner.nextLine();
        System.out.println("Enter the age");
        age = scanner.nextInt();

    }

    int compute() {
        int s1 = 0, c = 0;
        while (s1 < 20) {
            int p = (int) (Math.random() * 6) + 1;
            System.out.print(p + " ");
            if (s1 > 20) {
                break;
            }
            s1 = s1 + p;
            c++;

        }
        System.out.println(c);
        return c;
    }

    void display() {
        System.out.println("NAme is " + this.name);
        System.out.println("Age is" + this.age);
        System.out.println("NO of tries for" + this.name + " is ");

    }
}