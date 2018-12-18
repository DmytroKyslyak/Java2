package prj031;

import java.util.Arrays;
import java.util.Comparator;
interface MoveAble{	
	int move();
}
class Car implements MoveAble, Comparable<Car>{
	private int year;
	private String name;
	private int speed;
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public Car(int year, String name) {
		super();
		this.year = year;
		this.name = name;
	}
	@Override
	public int move() {		
		return speed;
	}
	@Override
	public int compareTo(Car c) {		
		return this.name.compareTo(c.name);
	}
	
	@Override
	public String toString() {
		return "Car [year=" + year + ", name=" + name + ", speed=" + speed + "]";
	}
	
		
}
class CompareByYear implements Comparator<Car>{

	@Override
	public int compare(Car c1, Car c2) {
		// TODO Auto-generated method stub
		return c1.getYear()-c2.getYear();
	}
	
}
class CompareByName implements Comparator<Car>{

	@Override
	public int compare(Car c1, Car c2) {
		// TODO Auto-generated method stub
		return c1.getName().compareTo(c2.getName());
	}
	
}
public class Program {

	public static void main(String[] args) {
		int mas [] = {1,2,-3,4,5,0};
		Arrays.sort(mas);
		System.out.println(Arrays.toString(mas));
		String strMas [] = {"Vasya","Petya","Alla"};
		Arrays.sort(strMas);
		System.out.println(Arrays.toString(strMas));
		Car carMas[]  = new Car[3];
		carMas[0]= new Car(12, "F");
		carMas[1]= new Car(4, "A");
		carMas[2]= new Car(9, "N");
		Arrays.sort(carMas,(c1,c2)-> c1.getYear()-c2.getYear());
		
		System.out.println(Arrays.toString(carMas));
		Arrays.sort(carMas, 
				new Comparator<Car>() {
					@Override
					public int compare(Car c1, Car c2) {							
						return c1.getName().compareTo(c2.getName());
					}
			    }
		);
		System.out.println(Arrays.toString(carMas));
		
	}

}
