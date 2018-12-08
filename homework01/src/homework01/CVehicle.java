package homework01;

public abstract class CVehicle {
	private String name;
	private int x;
	private int y;
	private int price;
	private int speed;
	private int year;	
	
		public CVehicle() {
			x = 0;
			y = 0;
			price = 0;
			speed = 0;
			year = 0;
			name = "";
		}
	public CVehicle(String name, int x, int y, int price, int speed, int year) {		
			this.x = x;
			this.y = y;
			this.price = price;
			this.speed = speed;
			this.year = year;
			this.name = name;
		}
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		
		@Override
		public String toString() {
			return "Name = "+ name + ", coordinates = x=" + x + ", y=" + y + ", price=" + price + ", speed=" + speed + ", year=" + year + "";
		}

}
