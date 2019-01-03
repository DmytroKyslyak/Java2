package ua.univer.duck;

public class RedheadDuck extends Duck{
	
public RedheadDuck() {
	quackBehavior = new Quack();
	flyBehavior = new FlyWithWings();
}
public void display() {
	System.out.println("--------I am a real RedheadDuck--------");
}

}
