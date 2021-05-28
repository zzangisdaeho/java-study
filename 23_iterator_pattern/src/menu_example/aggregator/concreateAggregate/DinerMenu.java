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

		additem("채식주의자용 BLT", "통밀 위에 (식물성)베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99);

		additem("BLT", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", false, 2.99);

		additem("오늘의 스프", "감자 샐러드를 곁들인 오늘의 스프", false, 3.29);

		additem("핫도그", "사워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그", false, 3.05);

	}

	public void additem(String name, String description, boolean vegetarian, double price) {

		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

		if (numberOfItems >= MAX_ITEMS) {

			System.err.println("죄송합니다, 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다.");

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

//기타 메소드

}
