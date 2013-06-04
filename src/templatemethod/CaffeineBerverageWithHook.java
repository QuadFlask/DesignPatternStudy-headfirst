package templatemethod;

public abstract class CaffeineBerverageWithHook {

	void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments())
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

	boolean customerWantsCondiments() {
		return true;
	}

}
