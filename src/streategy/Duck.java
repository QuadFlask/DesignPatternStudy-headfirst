package streategy;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	public abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("모든 오리는 물에 뜹니당");
	}

	public void  setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;
	}
}