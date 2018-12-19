package ua.univer.vehicle;

import ua.univer.vehicle.all.Car;
import ua.univer.vehicle.all.Plane;
import ua.univer.vehicle.all.Ship;

interface MoveAble{	
	int move();
}
interface FlyAble{	
	int fly();
}
interface SwimAble{	
	int swim();
}


public abstract class Vehicle {
	protected String name;
	protected int speed;
	
	public Vehicle(String name, int speed) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}



	public int move() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int compareTo(Car c) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int compareTo(Plane c) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int fly() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int compareTo(Ship c) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int swim() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
