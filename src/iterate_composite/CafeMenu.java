package iterate_composite;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
	Hashtable menuItems = new Hashtable();

	public CafeMenu() {
		addItem("베지 버거와 에어 프라이", "통밀빵, 상추, 토마토, 감자튀김이 첨가된 베지 버거", true, 3.99);
	}

	private void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.getName(), menuItem);
	}

//	public Hashtable getItems() {
//		return menuItems;
//	}

	@Override
	public Iterator createIterator() {
		return menuItems.values().iterator();
	}
}
