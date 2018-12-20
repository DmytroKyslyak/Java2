package ua.univer.vehicle;

import java.util.Comparator;

/*
interface MoveAble{	
	int move();
}
interface FlyAble{	
	int fly();
}
interface SwimAble{	
	int swim();
}

*/
public class Vehicle implements Comparable<Vehicle>{
	private String name;
	
	
	public Vehicle(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Name = "+ name + "";
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



}

