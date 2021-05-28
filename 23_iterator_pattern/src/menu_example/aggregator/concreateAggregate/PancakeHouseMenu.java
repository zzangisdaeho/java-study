package menu_example.aggregator.concreateAggregate;

import java.util.ArrayList;
import java.util.Iterator;

import menu_example.aggregator.Menu;
import menu_example.aggregator.item.MenuItem;

public class PancakeHouseMenu implements Menu {

	ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {

		this.menuItems = new ArrayList<MenuItem>();

		additem("K&B ������ũ ��Ʈ", "��ũ����� ���׿� �佺Ʈ�� ��鿩�� ������ũ", true, 2.99);

		additem("���ַ� ������ũ ��Ʈ", "�ް� �Ķ��̿� �ҽ����� ��鿩�� ������ũ", false, 2.99);

		additem("��纣�� ������ũ", "�ż��� ��纣���� ��纣�� �÷����� ���� ������ũ", true, 3.49);

		additem("����", "����, ���⿡ ���� ��纣���� ���⸦ ���� �� �ֽ��ϴ�.", true, 3.59);

	}

	public void additem(String name, String description, boolean vegetarian, double price) {

		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

		menuItems.add(menuItem);

	}

	public ArrayList<MenuItem> getMenuItems() {

		return menuItems;

	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}

//��Ÿ �޼ҵ�

}
