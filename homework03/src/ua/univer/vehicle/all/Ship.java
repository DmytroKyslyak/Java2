package ua.univer.vehicle.all;

import ua.univer.vehicle.Vehicle;

public class Ship extends Vehicle{

	private int passengers;
	private String port;
	
		public Ship() {
			port = "";
			passengers = 0;
		}
	public Ship(String name, int x, int y, int price, int speed, int year, int passengers, String port) {		
			super(name, x, y, price, speed, year);
			this.port = port;
			this.passengers=passengers;
		}
		
		public String getPort() {
			return port;
		}
		public void setPort(String port) {
			this.port = port;
		}
		public int getPassengers() {
			return passengers;
		}
		public void setPassengers(int passengers) {
			this.passengers = passengers;
		}
		
		@Override
		public String toString() {
			return "CShip ["+ super.toString() + ", passengers=" + passengers + ", port=" + port + "]";
		}
}


