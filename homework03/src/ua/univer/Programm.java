package ua.univer;

import java.util.Arrays;
import ua.univer.vehicle.Vehicle;
import ua.univer.vehicle.util.VehicleFactory;

public class Programm {

public static void main(String[] args) {
		
		
		Vehicle[] masObj = VehicleFactory.getListVehicle(5);
		System.out.println(Arrays.toString(masObj));
		System.out.println("********************Sort by name***************");
		
		Arrays.sort(masObj);
		System.out.println(Arrays.toString(masObj));
		
		System.out.println(Arrays.toString(masObj));
}
}
