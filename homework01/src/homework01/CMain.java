package homework01;

//import java.util.Scanner;

public class CMain{
	public static void main(String[] args) {
		
		CarList car = new CarList();
		car.add(new CCar("BMW",22,24,11000,350,2013));
		car.add(new CCar("VW",22,24,11000,350,2018));
		car.add(new CCar("Audi",22,24,11000,350,2015));
		car.add(new CCar("BMW",22,24,11000,350,2018));
		/*
		CCar car1 = new CCar("BMW",22,24,11000,350,2017);
		CCar car2 = new CCar("VW",22,24,11000,350,2017);
		CCar car3 = new CCar("Audi",22,24,11000,350,2017);
		CPlane plane1 = new CPlane("Boing",22,24,5000,11000,350,2015,250);
		plane1.setPassengers(220);
		CShip ship1 = new CShip("RR",22,24,11000,350,2010,550,"Odessa");
		ship1.setPort("Riga");
		
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        System.out.print("1-Car; 2-Plane; 3-Ship - Input a number: ");
        int vehicle = in.nextInt();
		
		String transport;
		switch (vehicle) {
		    case 1:  transport = car1.toString();
		             break;
		    case 2:  transport = plane1.toString();
		             break;
		    case 3:  transport = ship1.toString();
		             break;
		    default: transport = "Не знаем такого";
            		break;
		}   
		
		
		System.out.println(transport);	
		*/
		//car.print();
		car.printCarByName("BMW");
	}

}
