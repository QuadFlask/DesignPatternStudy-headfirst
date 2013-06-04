package templatemethod;

public abstract class CaffeineBerverage {

	// template method
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	public abstract void brew();

	public abstract void addCondiments();

	public void boilWater() {
		System.out.println("물 끓이는중");
	}

	public void pourInCup() {
		System.out.println("컴에 따르는 중");
	}
}

