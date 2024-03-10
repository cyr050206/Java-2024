//package human;

public class humane {
    public static void main(String[] args) {
        human MyHuman1 = new human();
        human MyHuman2 = new human();
        System.out.println("Name is " + MyHuman1.name);
        System.out.println("Sister's name is " + MyHuman2.name);
        MyHuman2.eat(MyHuman1);
        MyHuman2.drink();
    }
}

class human {
    String name;
    int age;
    double height;
    char gender;

    human() {
    };
    /*
     * human(String name, int age, int height, char gender) {
     * this.name = name;
     * this.age = age;
     * this.height = height;
     * this.gender = gender;
     * }
     **/

    void eat(human h1) {
        System.out.println("I eat! " + this.name);
    }

    void drink() {
        System.out.println("I drink! " + this.name);
    }
}
