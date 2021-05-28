package menu_example.aggregator;

import java.util.Iterator;

import menu_example.aggregator.item.MenuItem;

public interface Menu {

	public Iterator<MenuItem> createIterator();
}
