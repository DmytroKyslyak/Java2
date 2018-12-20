package ua.univer.vehicle.all;

import ua.univer.vehicle.Vehicle;

public class Ship extends Vehicle{
	
	private int speedSwim;
	
	public Ship(String name, int speedSwim) {
		super(name);
		this.speedSwim=speedSwim;

	}
	@Override
	public String toString() {
		return "Ship [" + super.toString() + ", speedSwim=" + speedSwim + "]";
	}
}
