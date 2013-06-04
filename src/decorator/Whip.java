package decorator;

public class Whip extends CondimentDecorator {
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 휘핑";
	}

	@Override
	public double cost() {
		return 0.40 + beverage.cost();
	}
}
