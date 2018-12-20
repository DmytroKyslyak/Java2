package ua.univer.vehicle.all;

import ua.univer.vehicle.Vehicle;

public class Car extends Vehicle{
	
	private int speedMov;
	public Car(String name, int speedMov) {
		super(name);
		this.speedMov=speedMov;

	}
	
	@Override
	public String toString() {
		return "Car [" + super.toString() + ", speedMov=" + speedMov + "]";
	}
}
