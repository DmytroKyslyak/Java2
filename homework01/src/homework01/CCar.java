package homework01;

public class CCar extends CVehicle{
	
	public CCar(int x, int y, int price, int speed, int year) {
		super(x, y, price, speed, year);

	}

	@Override
	public String toString() {
		return "Car [" + super.toString() + "]";
	}
}
