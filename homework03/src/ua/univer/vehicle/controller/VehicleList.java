package ua.univer.vehicle.controller;

import ua.univer.vehicle.all.Car;

public class VehicleList {


	private Car[] cars;
	private int count;
	
	
	public VehicleList() {
		cars = new Car[5];
		count=-1;
	}
	public void add(Car c) {
		cars[++count] = c;
	}
	public Car get(int i){
		if(i<size())
		return cars[i];
		else return null;
	}
	public void set(int i,Car c) {
		if(i<size())
			cars[i] = c;
	}
	public int size() {
		return count+1;
	}
	 public void print() {
			for (int i = 0; i < size(); i++) {		
				System.out.println(cars[i]);
			}
	
	 }
	 public void printCarByName(String name) {
		 for (int i = 0; i < size(); i++) {
			 if (cars[i].getName().equals(name)) {
				 System.out.println(cars[i]); }
		 }		 
	 }
	 public VehicleList getCarByName(String name) {
		 VehicleList carByName = new VehicleList();
		 for (int i = 0; i < size(); i++) {
			 if (cars[i].getName().equals(name)) {
				 carByName.add(cars[i]); }
		 }		 
		 return carByName;
	 }
}
