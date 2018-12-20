package ua.univer.vehicle.all;

import ua.univer.vehicle.Vehicle;

public class Batmobile extends Vehicle{
	private int speedMov;
	private int speedSwim;
	private int speedFly;

	public Batmobile(String name, int speedMov, int speedSwim, int speedFly) {
		super(name);
		this.speedMov=speedMov;
		this.speedSwim=speedSwim;
		this.speedFly=speedFly;
	}

	@Override
	public String toString() {
		return "Batmobile [" + super.toString() + ", speedMov=" + speedMov + ", speedSwim=" + speedSwim + ", speedFly=" + speedFly + "]";
	}
}

