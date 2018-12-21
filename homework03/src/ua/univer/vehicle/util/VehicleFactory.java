package ua.univer.vehicle.util;

import ua.univer.vehicle.Vehicle;
import ua.univer.vehicle.all.Amfibiya;
import ua.univer.vehicle.all.Batmobile;
import ua.univer.vehicle.all.Car;
import ua.univer.vehicle.all.Plane;
import ua.univer.vehicle.all.Ship;

public class VehicleFactory {

	public static Vehicle getVehicle(int i){
		switch (i) {
		case 0: return new Car("BMW", 350);
		case 1: return new Plane("Boing", 11000);
		case 2: return new Ship("RR", 50);
		case 3: return new Amfibiya("AA", 150);
		case 4: return new Batmobile("BATMAN", 500);
		default: return null;
		}		
	}

	public static Vehicle randVehicle(){
		return getVehicle((int) (Math.random()*5));
	}
	public static Vehicle[] getListVehicle(int n){
		Vehicle[] masVehicle = new Vehicle[n];
		for (int i = 0; i < masVehicle.length; i++) {
			masVehicle[i]=randVehicle();
		}
		return masVehicle;
	}

}
