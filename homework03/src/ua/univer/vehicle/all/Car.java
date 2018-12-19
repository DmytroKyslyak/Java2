package ua.univer.vehicle.all;

import ua.univer.vehicle.Vehicle;



public class Car extends Vehicle{
	
	public Car(String name, int speed) {
		super(name, speed);

	}
	
	@Override
	public String toString() {
		return "Car [" + super.toString() + "]";
	}
}
