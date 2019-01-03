package ua.univer.duck;

public class ModelDuck extends Duck{
	public ModelDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}
	public void display() {
		System.out.println("--------I am a real ModelDuck--------");
	}
}
