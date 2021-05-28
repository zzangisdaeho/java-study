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

		// Waitress���� iterator pattern�� �ɾ��־�, �ڵ忡�� for�� ���̵� �� �޴��� ���� �ݺ������ �����ϰ��Ѵ�
		waitress.printMenu();

	}

}
