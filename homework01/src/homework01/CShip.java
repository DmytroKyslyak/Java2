package homework01;

public class CShip extends CVehicle{

	private int x;
	private int y;
	private int price;
	private int speed;
	private int year;
	private int passengers;
	
		public CShip() {
			x = 0;
			y = 0;
			price = 0;
			speed = 0;
			year = 0;
			passengers = 0;
		}
	public CShip(int x, int y, int price, int speed, int year, int passengers) {		
			this.x = x;
			this.y = y;
			this.price = price;
			this.speed = speed;
			this.year = year;
			this.passengers=passengers;
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public int getPassengers() {
			return passengers;
		}
		public void setPassengers(int passengers) {
			this.passengers = passengers;
		}
		
		@Override
		public String toString() {
			return "CShip [x=" + x + ", y=" + y + ", price=" + price + ", speed=" + speed + ", year=" + year + ", passengers=" + passengers + "]";
		}
}

