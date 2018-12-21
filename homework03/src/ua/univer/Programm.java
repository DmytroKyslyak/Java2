package ua.univer;

import java.util.Arrays;
import ua.univer.vehicle.Vehicle;
import ua.univer.vehicle.all.Car;
import ua.univer.vehicle.all.MoveAble;
import ua.univer.vehicle.all.SwimAble;
import ua.univer.vehicle.all.FlyAble;
import ua.univer.vehicle.util.VehicleFactory;

public class Programm {

public static void main(String[] args) {
		
		
		Vehicle[] masObj = VehicleFactory.getListVehicle(5);
		System.out.println(Arrays.toString(masObj));
		System.out.println("********************Sort by name***************");
		
		Arrays.sort(masObj,(v1,v2)-> v1.getName().compareTo(v2.getName()));
		System.out.println(Arrays.toString(masObj));
		
		System.out.println("********************Sort by Speed***************");
		Arrays.sort(masObj,(v1,v2)-> v1.getSpeed()-v2.getSpeed());
		System.out.println(Arrays.toString(masObj));
		
		System.out.println("********************Max Speed***************");

		System.out.println(maxSpeed(masObj));
		
		System.out.println("********************MoveAble***************");
		for (int i = 0; i < masObj.length; i++) {
			if(masObj[i] instanceof MoveAble){
				MoveAble ma =((MoveAble)masObj[i]);
				System.out.println(ma);}
		}
		System.out.println("********************SwimAble***************");
		for (int i = 0; i < masObj.length; i++) {
			if(masObj[i] instanceof SwimAble){
				SwimAble sw =((SwimAble)masObj[i]);
				System.out.println(sw);}
		}
		System.out.println("********************FlyAble***************");
		for (int i = 0; i < masObj.length; i++) {
			if(masObj[i] instanceof FlyAble){
				FlyAble fl =((FlyAble)masObj[i]);
				System.out.println(fl);}
		}
		System.out.println("********************Cars***************");
		for (int i = 0; i < masObj.length; i++) {
			if(masObj[i] instanceof Car){
				Car cars =((Car)masObj[i]);
				System.out.println(cars);}
		}
}

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
