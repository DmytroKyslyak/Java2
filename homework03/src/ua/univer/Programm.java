package ua.univer;

import java.util.Arrays;
import ua.univer.vehicle.Vehicle;
import ua.univer.vehicle.all.Car;
//import ua.univer.vehicle.controller.VehicleList;
import ua.univer.vehicle.util.VehicleFactory;

public class Programm {

public static void main(String[] args) {
		
		
		Vehicle[] masObj = VehicleFactory.getListVehicle(5);
		System.out.println(Arrays.toString(masObj));
}
}
