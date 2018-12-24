package ua.univer.duck;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck readhead = new RedheadDuck();
		readhead.performQuack();
		readhead.performFly();
		
		Duck rubber = new RubberDuck();
		rubber.performQuack();
		rubber.performFly();
	}

}
