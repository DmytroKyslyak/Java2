package homework01;

public class CMain{
	public static void main(String[] args) {
		CVehicle car1 = new CCar(22,24,11000,350,2017);
		CVehicle plane1 = new CPlane(22,24,5000,11000,350,2017,250);
		CVehicle ship1 = new CShip(22,24,11000,350,2017,250);
		System.out.println(car1);
		System.out.println(plane1);
		System.out.println(ship1);
	}

}
