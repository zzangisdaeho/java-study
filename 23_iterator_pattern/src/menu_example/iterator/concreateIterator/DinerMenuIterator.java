package menu_example.iterator.concreateIterator;

import java.util.Iterator;

import menu_example.aggregator.item.MenuItem;

// array는 list와 다르게 iterator를 구현하는 메서드가 없기에 수동으로 구현해준다.
// ★ Pancake와 Dinner의 iterator 구현체가 다르더라도, 상관없다. 어짜피 iterator는 hasNext와 next를 구현해주기만 하면 된다. (어짜피 다른 메서드는 활용되지도 않는다.)
// book_example과 다르게 Iterator를 그냥 java에 구현되어 있는 것으로 사용했다.(book_example의 Iterator는 java의 Iterator를 베낀것에 불과하다)
public class DinerMenuIterator implements Iterator<MenuItem> {

	MenuItem[] list;
	int position = 0;

	public DinerMenuIterator(MenuItem[] list) {
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		if (position >= list.length || list[position] == null)
			return false;
		else
			return true;
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = list[position];
		position++;
		return menuItem;
	}

	@Override
	public void remove() { // 반드시 기능을 제공하지 않아도됨 그렇다면 java.lang.UnsupportedOperationException을 던지도록 하면됨

		if (position <= 0)
			throw new IllegalStateException("next()가 한번도 호출되지 않음.");
		// 현재 position에 해당하는 요소를 지우기 위해 뒤의 요소를 하나씩 앞으로 땡긴다 맨 마지막 두개는 중복되기에 마지막을 지워준다.
		if (list[position - 1] != null) {
			for (int i = position - 1; i < (list.length - 1); i++) {
				list[i] = list[i + 1];
			}
			list[list.length - 1] = null;
		}
	}

}
