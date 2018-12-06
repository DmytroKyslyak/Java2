package homework01;

public class CShip extends CVehicle{

	private int passengers;
	private String port;
	
		public CShip() {
			port = "";
			passengers = 0;
		}
	public CShip(int x, int y, int price, int speed, int year, int passengers, String port) {		
			super(x, y, price, speed, year);
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

