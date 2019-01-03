package ua.univer.duck;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
		
		
		Duck readhead = new RedheadDuck();
		readhead.display();
		readhead.performQuack();
		readhead.performFly();
		
		
		Duck rubber = new RubberDuck();
		rubber.display();
		rubber.performQuack();
		rubber.performFly();
		
		
		Duck decoy = new DecoyDuck();
		decoy.display();
		decoy.performQuack();
		decoy.performFly();
		
		
		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		
		
	}

}
