package streategy;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck duck = new ModelDuck();
		duck.performFly();
		duck.setFlyBehavior(new FlyRocketPowered());
		duck.performFly();
	}
}
