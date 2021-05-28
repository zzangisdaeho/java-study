package menu_example.iterator.concreateIterator;

import java.util.Iterator;

import menu_example.aggregator.item.MenuItem;

// array�� list�� �ٸ��� iterator�� �����ϴ� �޼��尡 ���⿡ �������� �������ش�.
// �� Pancake�� Dinner�� iterator ����ü�� �ٸ�����, �������. ��¥�� iterator�� hasNext�� next�� �������ֱ⸸ �ϸ� �ȴ�. (��¥�� �ٸ� �޼���� Ȱ������� �ʴ´�.)
// book_example�� �ٸ��� Iterator�� �׳� java�� �����Ǿ� �ִ� ������ ����ߴ�.(book_example�� Iterator�� java�� Iterator�� �����Ϳ� �Ұ��ϴ�)
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
	public void remove() { // �ݵ�� ����� �������� �ʾƵ��� �׷��ٸ� java.lang.UnsupportedOperationException�� �������� �ϸ��

		if (position <= 0)
			throw new IllegalStateException("next()�� �ѹ��� ȣ����� ����.");
		// ���� position�� �ش��ϴ� ��Ҹ� ����� ���� ���� ��Ҹ� �ϳ��� ������ ����� �� ������ �ΰ��� �ߺ��Ǳ⿡ �������� �����ش�.
		if (list[position - 1] != null) {
			for (int i = position - 1; i < (list.length - 1); i++) {
				list[i] = list[i + 1];
			}
			list[list.length - 1] = null;
		}
	}

}
