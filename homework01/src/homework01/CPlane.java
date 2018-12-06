package homework01;

public class CPlane extends CVehicle{
	private int x;
	private int y;
	private int price;
	private int speed;
	private int year;
	private int height;
	private int passengers;
	
		public CPlane() {
			x = 0;
			y = 0;
			price = 0;
			speed = 0;
			year = 0;
			height = 0;
			passengers = 0;
		}
	public CPlane(int x, int y, int height, int price, int speed, int year, int passengers) {		
			this.x = x;
			this.y = y;
			this.price = price;
			this.speed = speed;
			this.year = year;
			this.height=height;
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
			return "CPlane [x=" + x + ", y=" + y + ", height=" + height + ", price=" + price + ", speed=" + speed + ", year=" + year + ", passengers=" + passengers + "]";
		}
}



