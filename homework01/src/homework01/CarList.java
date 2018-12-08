package homework01;

//import java.util.Arrays;


public class CarList {
	private CCar[] cars;
	private int count;
	
	
	public CarList() {
		cars = new CCar[5];
		count=-1;
	}
	public void add(CCar c) {
//		if(count==cars.length-1){
//			cars=Arrays.copyOf(cars, cars.length*2);
//	}
		cars[++count] = c;
	}
	public CCar get(int i){
		if(i<size())
		return cars[i];
		else return null;
	}
	public void set(int i,CCar c) {
		if(i<size())
			cars[i] = c;
	}
	public int size() {
		return count+1;
	}
	 public void print() {
			for (int i = 0; i < size(); i++) {		
				System.out.println(cars[i]);
			}
	
	 }
	 public void printCarByName(String name) {
		 for (int i = 0; i < size(); i++) {
			 if (cars[i].getName().equals(name)) {
				 System.out.println(cars[i]); }
		 }		 
	 }
	 public CarList getCarByName(String name) {
		 CarList carByName = new CarList();
		 for (int i = 0; i < size(); i++) {
			 if (cars[i].getName().equals(name)) {
				 carByName.add(cars[i]); }
		 }		 
		 return carByName;
	 }
}
