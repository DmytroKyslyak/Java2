package ua.univer.vehicle.all;

import ua.univer.vehicle.Vehicle;

public class Amfibiya extends Vehicle{
	
	private int speedMov;
	private int speedSwim;

	public Amfibiya(String name, int speedMov, int speedSwim) {
		super(name);
		this.speedMov=speedMov;
		this.speedSwim=speedSwim;
	}

	@Override
	public String toString() {
		return "Amfibiya [" + super.toString() + ", speedMov=" + speedMov + ", speedSwim=" + speedSwim + "]";
	}
}

