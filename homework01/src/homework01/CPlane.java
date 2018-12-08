package homework01;

public class CPlane extends CVehicle{
	
	private int height;
	private int passengers;
	
		public CPlane() {
			
			height = 0;
			passengers = 0;
		}
	public CPlane(String name, int x, int y, int height, int price, int speed, int year, int passengers) {		
			super(name, x, y, price, speed, year);
			this.height=height;
			this.passengers=passengers;
		}
		
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public int getPassengers() {
			return passengers;
		}
		public void setPassengers(int passengers) {
			this.passengers = passengers;
		}
		
		@Override
		public String toString() {
			return "CPlane ["+ super.toString() + ", passengers=" + passengers + "]";
		}
}



