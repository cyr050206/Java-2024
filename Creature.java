import java.util.Scanner;
public class Creature {
 
    public static void main(String[] args) {
        Animal animal;
        Scanner scanner=new Scanner(System.in);
        System.out.println("What animal do you want?");
        String choice = scanner.next();
        if(choice.equalsIgnoreCase("dog")){
            animal = new Dog();
            animal.speak();
        }
        else if(choice.equalsIgnoreCase("cat")){
            animal = new Cat();
            animal.speak();
        }
        else{
            animal = new Animal();
            System.out.println("Wrong animal!!!");
            animal.speak();
        }
        scanner.close();
    }
}
class Animal{
void speak(){
System.out.println("Animal goes *brrrr*");
}
}
class Dog extends Animal{
void speak(){
    System.out.println("Dog goes *bhow*");
}
}
class Cat extends Animal{
void speak(){
    System.out.println("Cat goes *meow*");
}
}

