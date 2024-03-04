//package human;

public class humane {
    public static void main(String[] args) {
        human MyHuman1 = new human("Cyrus", 18, 750, 'M');
        human MyHuman2 = new human("Alice", 11, 550, 'F');
        System.out.println("Name is " + MyHuman1.name);
        System.out.println("Sister's name is " + MyHuman2.name);
        MyHuman2.eat();
        MyHuman2.drink();
    }
}

class human {
    String name;
    int age;
    double height;
    char gender;

    human(String name, int age, int height, char gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = gender;
    }

    void eat() {
        System.out.println("I eat! " + this.name);
    }

    void drink() {
        System.out.println("I drink! " + this.name);
    }
}
