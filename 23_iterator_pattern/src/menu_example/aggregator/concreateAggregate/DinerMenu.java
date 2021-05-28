package menu_example.aggregator.concreateAggregate;

import java.util.Iterator;

import menu_example.aggregator.Menu;
import menu_example.aggregator.item.MenuItem;
import menu_example.iterator.concreateIterator.DinerMenuIterator;

public class DinerMenu implements Menu {

	static final int MAX_ITEMS = 6;

	int numberOfItems = 0;

	MenuItem[] menuItems;

	public DinerMenu() {

		this.menuItems = new MenuItem[MAX_ITEMS];

		additem("ä�������ڿ� BLT", "��� ���� (�Ĺ���)������, ����, �丶�並 ���� �޴�", true, 2.99);

		additem("BLT", "��� ���� ������, ����, �丶�並 ���� �޴�", false, 2.99);

		additem("������ ����", "���� �����带 ����� ������ ����", false, 3.29);

		additem("�ֵ���", "���ũ���Ʈ, ���� ���, ����, ġ� ��鿩�� �ֵ���", false, 3.05);

	}

	public void additem(String name, String description, boolean vegetarian, double price) {

		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

		if (numberOfItems >= MAX_ITEMS) {

			System.err.println("�˼��մϴ�, �޴��� �� á���ϴ�. �� �̻� �߰��� �� �����ϴ�.");

		} else {

			menuItems[numberOfItems] = menuItem;

			numberOfItems = numberOfItems + 1;

		}

	}

	public MenuItem[] getMenuItems() {

		return menuItems;

	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return new DinerMenuIterator(menuItems);
	}

//��Ÿ �޼ҵ�

}
