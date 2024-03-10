import java.util.*;

public class ObjToMeth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = 1976;
        String make = "Porsche";
        int id = 911;
        int year = 2001;
        Car car = new Car(make, id, year);
        car.printCarInfo(car);
        System.out.println("Enter new year: ");
        int nYear = sc.nextInt();
        car.updateYear(car, nYear);
        car.changeInfo(car);

    }
}

class Car {
    String make;
    int id;
    int year;

    Car() {
    };

    Car(String make, int id, int year) {
        this.make = make;
        this.id = id;
        this.year = year;

    }

    void printCarInfo(Car exe) {
        System.out.println("Make: " + exe.make);
        System.out.println("ID: " + exe.id);
        System.out.println("Year: " + exe.year);
    }

    void updateYear(Car car, int year) {
        // System.out.println("Enter new year!");
        car.year = year;
        System.out.println("New Info is: ");
        car.printCarInfo(car);
    }

    Car changeInfo(Car exe) {
        System.out.println("Updated Info: ");
        Car temp = new Car();
        temp.id = 2024;
        temp.make = "Lamborgini";
        temp.year = 1676;
        exe.printCarInfo(temp);
        return exe;

    }

}
