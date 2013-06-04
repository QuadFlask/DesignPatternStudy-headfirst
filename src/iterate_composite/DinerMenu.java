package iterate_composite;

import java.util.Iterator;

public class DinerMenu implements Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;

	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];

		addItem("채식주의자용 BLT", "통밀위에 식물성 베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99);
		addItem("BLT", "통밀위에 베이컨, 상추, 토마토를 얹은 메뉴", false, 2.99);
		addItem("오늘의  스프", "감자 샐러드를 겿들인 오늘의 스프", false, 3.29);
		addItem("핫도그", "사워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그", false, 3.05);
	}

	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menunItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.out.println("메뉴가 꽉 찼습니다.");
		} else {
			menuItems[numberOfItems] = menunItem;
			numberOfItems = numberOfItems + 1;
		}
	}

	public MenuItem[] getMenuItems() {
		return menuItems;
	}
}
