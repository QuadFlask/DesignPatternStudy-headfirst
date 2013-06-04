package iterate_composite;

import java.util.*;

public class PancakeHouseMenu implements Menu {
	ArrayList menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList();

		addItem("K&B pancake set", "scramble egg and toast with cake", true, 2.99);
		addItem("Regular pancake set", "fired egg with sosegi cake", false, 2.99);
		addItem("Buleberry cake", "fresh bluberry and bluebarry sirub cake", true, 3.49);
		addItem("Waffle", "Waffle, blueberry or strawbery as choice", true, 3.59);
	}

	public java.util.Iterator createIterator(){
		return menuItems.iterator();
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menunItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menunItem);
	}

	public ArrayList getMenuItems(){
		return menuItems;
	}
}
