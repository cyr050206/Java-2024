public class PassingObj {
    public static void main(String[] args) {
        Car car = new Car("Mercedes");
        Garage garage = new Garage();
        garage.park(car);
    }

}

class Car {
    String name;

    Car(String name) {
        this.name = name;
    }

}

class Garage {
    void park(Car car) {
        System.out.println("The car parked here is " + car.name);
    }

}