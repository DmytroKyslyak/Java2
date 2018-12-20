package ua.univer.vehicle.all;

import ua.univer.vehicle.Vehicle;

public class Plane extends Vehicle{
	
	private int speedFly;
	
	public Plane(String name, int speedFly) {
		super(name);
		this.speedFly=speedFly;

	}
	@Override
	public String toString() {
		return "Plane [" + super.toString() + ", speedFly=" + speedFly + "]";
	}	
	
}
