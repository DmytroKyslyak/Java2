package ua.univer.vehicle.all;

import ua.univer.vehicle.Vehicle;

public class Amfibiya extends Vehicle implements MoveAble, SwimAble{
	
	public Amfibiya(String name, int speed) {
		super(name, speed);
	}
	@Override
	public String toString() {
		return "Amfibiya [" + super.toString() + "]";
	}
	
	@Override
	public void move() {
		System.out.println(getClass().getName() + " едет");
	}
	@Override
	public void swim() {
		System.out.println(getClass().getName() + " плывет");
	}
}

