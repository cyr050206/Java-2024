import java.util.*;

class cyrus {
    public static void main(String[] args) {
        String name;
        int age;
        int height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = scanner.nextLine();
        System.out.println("Enter age");
        age = scanner.nextInt();
        System.out.println("Enter height: ");
        height = scanner.nextInt();

        thing bruh = new thing(name, age, height);
        bruh.display();
        scanner.close();
    }
}
class thing {
    String name;
    int age, height;

    thing(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;

        // System.out.println(" Height is "+height);
    }

    void display() {
        System.out.println("Name is" + name + " and age is " + age);
        System.out.println(" Height is " + height);

    }
}

