package templatemethod;

public class BerverageTestDrive {

	public static void main(String[] args) {
		CoffeeWithHook coffee = new CoffeeWithHook();

		System.out.println("Ready coffee");
		coffee.prepareRecipe();

	}
}
