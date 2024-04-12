public class Main {

	public static void main(String[] args) {
			
		Car car = new Car(0);
		
		car.go();
		
		Bicycle bike = new Bicycle(0);
		
		car.go();
		bike.stop();
		System.out.println(car.doors);
		System.out.println(bike.pedals);
		System.out.println("The speed of the bicycle is "+car.speed);
				
	}
}
//*************************************
class Vehicle{
double speed;
Vehicle(double speed){
	this.speed = speed;
}
void go(){
System.out.println("This vehicle is moving");
}
void stop(){
System.out.println("This vehicle is stopped");
}
}
//*************************************
class Car extends Vehicle{
int wheels = 4;
int doors = 4;

Car(double speed){
	super(95);
	//this.speed = 95.0;
}
}
//*************************************
class Bicycle extends Vehicle{

int wheels = 2;
int pedals = 2;
double speed;
Bicycle(double speed){
//this.speed =15; 
	super(15);
	
}


}
//*************************************
