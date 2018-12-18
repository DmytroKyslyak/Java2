package ua.univer.vehicle.util;

import ua.univer.vehicle.Vehicle;
import ua.univer.vehicle.all.Car;
import ua.univer.vehicle.all.Plane;
import ua.univer.vehicle.all.Ship;

public class VehicleFactory {

	public static Vehicle getVehicle(int i){
		switch (i) {
		case 0: return new Car("BMW",22,24,11000,350,2013);
		case 1: return new Plane("Boing",22,24,5000,11000,350,2015,250);
		case 2: return new Ship("RR",22,24,11000,350,2010,550,"Odessa");
		case 3: return new Car("VW",22,24,11000,350,2018);
		default: return null;
		}		
	}
	
	public static Vehicle randVehicle(){
		return getVehicle((int) (Math.random()*4));
	}
	public static Vehicle[] getListVehicle(int n){
		Vehicle[] masVehicle = new Vehicle[n];
		for (int i = 0; i < masVehicle.length; i++) {
			masVehicle[i]=randVehicle();
		}
		return masVehicle;
	}

}
