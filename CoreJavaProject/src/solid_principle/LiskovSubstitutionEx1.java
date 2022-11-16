package solid_principle;
/*
 * SOLID Principles -
 * SOLID is an acronym for the first object-oriented design (ooD) 
 * principles by C.Mortin
 * 
 * S - Single Responsibility Principle - 
 * 				A class should have one and only one reason to change.
 * O - Open Closed Principle - 
 * 				Objects or entities should be open for extension but closed for modification. 
 * L - Liskov Substitution Principle -
 * 				Objects of super class shall be replaced with objects of subclasses.
 * I -
 * D -
 */
class Vehicle{
	public void start() {
		System.out.println("Starting a vehicle");
	}
	public void stop() {
		System.out.println("Stopping a vehicle");
	}
}
class Bike extends Vehicle{
	public void start() {
		System.out.println("Starting a bike");
	}
	public void stop() {
		System.out.println("Stopping a bike");
	}
}
class Car extends Vehicle{
	public void start() {
		System.out.println("Starting a car");
		//throw new RuntimeException("boom you are gone");
	}
	public void stop() {
		System.out.println("Stopping a car");
	}
}
public class LiskovSubstitutionEx1 {
	static void testdrive(Vehicle vehicle) {
		vehicle.start();
		vehicle.stop();
	}
	public static void main(String[] args) {
		testdrive(new Vehicle());
		testdrive(new Bike());
		testdrive(new Car());
	}
}
