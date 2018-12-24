package ua.univer.duck;

public class RedheadDuck extends Duck{
	
public RedheadDuck() {
	quackBehavior = new MuteQuack();
	flyBehavior = new FlyNoWay();
}
public void display() {
	System.out.println("I am a real RedheadDuck");
}

}
