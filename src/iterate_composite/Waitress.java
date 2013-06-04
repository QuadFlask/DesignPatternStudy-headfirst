package iterate_composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
	ArrayList<Menu> menuList;

	public Waitress() {
		menuList = new ArrayList<Menu>();
	}

	public void addMenu(Menu menu) {
		menuList.add(menu);
	}

	public void printMenu() {
		for(Menu menu:menuList){
			Iterator iterator = menu.createIterator();

			System.out.println("Menu\n-----\nBreakfast");
			printMenu(iterator);
		}
	}

	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem item = (MenuItem) iterator.next();
			System.out.print(item.getName() + ", ");
			System.out.print(item.getPrice() + " -- ");
			System.out.println(item.getDescription());
		}
	}
}
