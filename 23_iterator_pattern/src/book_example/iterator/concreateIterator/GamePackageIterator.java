package book_example.iterator.concreateIterator;

import book_example.aggreate.concreateAggregate.GamePackage;
import book_example.iterator.Iterator;
import book_example.model.Game;

public class GamePackageIterator implements Iterator {
	
	private GamePackage gamePackage;
	private int index;
	
	public GamePackageIterator(GamePackage gamePackage) {
		super();
		this.gamePackage = gamePackage;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if(this.index < this.gamePackage.getLength())return true;
		else return false;
	}

	@Override
	public Object next() {
		Game game = this.gamePackage.getGame(index);
		index++;
		return game;
	}

}
