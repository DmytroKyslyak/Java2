package ua.univer.vehicle.all;

import ua.univer.vehicle.Vehicle;

public class Plane extends Vehicle implements FlyAble{
	
		public Plane(String name, int speed) {
		super(name, speed);
			}
	@Override
	public String toString() {
		return "Plane [" + super.toString() + "]";
	}	
	@Override
	public void fly() {
		System.out.println(getClass().getName() + " летит");
		
	}

	
}
