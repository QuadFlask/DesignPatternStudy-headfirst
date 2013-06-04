package singleton;

public class ChoolateBoiler {
	private volatile static ChoolateBoiler uniqueInstance;
	private boolean empty;
	private boolean boiled;

	private ChoolateBoiler() {
		empty = true;
		boiled = false;
	}

	// DCL
	public static ChoolateBoiler getInstance() {
		if (uniqueInstance == null) {
			synchronized (ChoolateBoiler.class) {
				if (uniqueInstance == null)
					uniqueInstance = new ChoolateBoiler();
			}
		}
		return uniqueInstance;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
		}
	}

	public void drain() {
		if (!isEmpty() && isBoiled()) {
			empty = true;
		}
	}

	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
}
