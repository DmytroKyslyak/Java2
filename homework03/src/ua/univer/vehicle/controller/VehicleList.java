package ua.univer.vehicle.controller;

import ua.univer.vehicle.Vehicle;
import ua.univer.vehicle.util.VehicleFactory;

public class VehicleList {

	Vehicle[] masObj = VehicleFactory.getListVehicle(5);
	
	public static Vehicle maxSpeed(Vehicle[] masObj) {
		int maxSpeed = 0;
		Vehicle max = null;
		for (int i = 0; i < masObj.length; i++) {
			if (masObj[i].getSpeed() > maxSpeed) {
				maxSpeed = masObj[i].getSpeed();
				max = masObj[i];}}
		return max;
	}

}
