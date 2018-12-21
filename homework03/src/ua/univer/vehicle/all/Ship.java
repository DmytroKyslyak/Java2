package ua.univer.vehicle.all;

import ua.univer.vehicle.Vehicle;

public class Ship extends Vehicle implements SwimAble{
	
		public Ship(String name, int speed) {
		super(name, speed);
	}
	@Override
	public String toString() {
		return "Ship [" + super.toString() + "]";
	}
	@Override
	public void swim() {
		System.out.println(getClass().getName() + " плывет");
		
	}
	
}
