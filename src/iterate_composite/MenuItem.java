package iterate_composite;

public class MenuItem {
	String name;
	String description;
	boolean vegetraian;
	double price;

	public MenuItem(String name, String description, boolean vegetraian, double price) {
		this.name = name;
		this.description = description;
		this.vegetraian = vegetraian;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean isVegetraian() {
		return vegetraian;
	}

	public double getPrice() {
		return price;
	}
}
