package ua.univer.vehicle.all;

import ua.univer.vehicle.Vehicle;

public class Batmobile extends Vehicle implements MoveAble, SwimAble, FlyAble{

	public Batmobile(String name, int speed) {
		super(name, speed);
	}

	@Override
	public String toString() {
		return "Batmobile [" + super.toString() + "]";
	}
	@Override
	public void move() {
		System.out.println(getClass().getName() + " едет");
	}
	@Override
	public void swim() {
		System.out.println(getClass().getName() + " плывет");
	}
	@Override
	public void fly() {
		System.out.println(getClass().getName() + " летит");
		
	}
}

