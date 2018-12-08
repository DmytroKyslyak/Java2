package homework01;

public class CCar extends CVehicle{
	
	public CCar(String name, int x, int y, int price, int speed, int year) {
		super(name, x, y, price, speed, year);

	}

	@Override
	public String toString() {
		return "Car [" + super.toString() + "]";
	}
}
