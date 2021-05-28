package menu_example.actor;

import java.util.ArrayList;

import menu_example.aggregator.Menu;
import menu_example.aggregator.concreateAggregate.DinerMenu;
import menu_example.aggregator.concreateAggregate.PancakeHouseMenu;

public class Run {

	public static void main(String[] args) {
		ArrayList<Menu> menuList = new ArrayList();

		menuList.add(new PancakeHouseMenu());

		menuList.add(new DinerMenu());

		Waitress waitress = new Waitress(menuList);

		// Waitress에게 iterator pattern을 심어주어, 코드에서 for문 없이도 각 메뉴에 대해 반복출력이 가능하게한다
		waitress.printMenu();

	}

}
