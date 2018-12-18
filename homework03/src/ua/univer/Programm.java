package ua.univer;

import java.util.Arrays;
import ua.univer.vehicle.Vehicle;
import ua.univer.vehicle.all.Car;
import ua.univer.vehicle.controller.VehicleList;
import ua.univer.vehicle.util.VehicleFactory;

public class Programm {

public static void main(String[] args) {
		
		VehicleList car = new VehicleList();
		car.add(new Car("BMW",22,24,11000,350,2013));
		car.add(new Car("VW",22,24,11000,350,2018));
		car.add(new Car("Audi",22,24,11000,350,2015));
		car.add(new Car("BMW",22,24,11000,350,2018));
		
		car.printCarByName("BMW");
		
		Vehicle[] masObj = VehicleFactory.getListVehicle(5);
		System.out.println(Arrays.toString(masObj));
}
}
