package iterate_composite;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator {
	ArrayList<MenuItem> items;
	int position = 0;

	public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
		this.items = menuItems;
	}

	@Override
	public Object next() {
		MenuItem menuItem = items.get(position);
		position++;
		return menuItem;
	}

	@Override
	public void remove() {
		//To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public boolean hasNext() {
		if (position >= items.size() || items.get(position) == null) {
			return false;
		} else {
			return true;
		}
	}
}
