package adapter;

public class DuckTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();

		WildTurkey turkey = new WildTurkey();

		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("The turkey says...");
		turkey.gobble();
		turkey.fly();

		System.out.println("\nThe Duck says...");
		duck.quack();
		duck.fly();

		System.out.println("\nThe turkeyadpater says...");
		testDuck(turkeyAdapter);
	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
