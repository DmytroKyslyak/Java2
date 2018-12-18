package ua.univer.vehicle.all;

import ua.univer.vehicle.Vehicle;

public class Car extends Vehicle{
	
	public Car(String name, int x, int y, int price, int speed, int year) {
		super(name, x, y, price, speed, year);
	}
	@Override
	public String toString() {
		return "Car [" + super.toString() + "]";
	}
}
