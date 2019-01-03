package ua.univer.duck;

public class RubberDuck extends Duck{
	
	public RubberDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}
	public void display() {
		System.out.println("--------I am a real RubberDuck--------");
	}

}
