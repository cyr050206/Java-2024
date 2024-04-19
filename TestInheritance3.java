class Animal {
    protected void eat() {
        System.out.println("eating...");
    }
}


class Dog extends Animal {
     void bark() {
        System.out.println("barking...");
    }
}

class Cat extends Dog {
    void meow() {
        System.out.println("meowing...");
    }
}

class TestInheritance3 {
    public static void main(String args[]) {
        Cat c = new Cat();
        Animal animal = new Animal();
        c.meow();
        c.eat();
        c.bark();
        animal.eat();
        // c.bark();//C.T.Error
    }
}
