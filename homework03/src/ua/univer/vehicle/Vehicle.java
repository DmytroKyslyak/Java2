package ua.univer.vehicle;

import java.util.Comparator;

public class Vehicle implements Comparable<Vehicle>{
	private String name;
	private int speed;
	

	
	public Vehicle(String name, int speed) {
		this.name=name;
		this.speed=speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Name = "+ name + ",Speed = "+ speed + "";
	}
// Сортировка по имени
	
	@Override
	public int compareTo(Vehicle v) {
		return this.name.compareTo(v.name);
	}
	
	class CompareByName implements Comparator<Vehicle>{

		@Override
		public int compare(Vehicle v1, Vehicle v2) {
			return v1.getName().compareTo(v2.getName());
		}
}
	// Сортировка по скорости
	
	class CompareBySpeed implements Comparator<Vehicle>{

		@Override
		public int compare(Vehicle v1, Vehicle v2) {
			// TODO Auto-generated method stub
			return v1.getSpeed()-v2.getSpeed();
		}
	}
}



