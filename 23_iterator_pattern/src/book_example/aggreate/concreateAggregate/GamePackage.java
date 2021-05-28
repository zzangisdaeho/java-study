package book_example.aggreate.concreateAggregate;

import book_example.aggreate.Aggregate;
import book_example.iterator.Iterator;
import book_example.iterator.concreateIterator.GamePackageIterator;
import book_example.model.Game;

public class GamePackage implements Aggregate {
	
	private Game[] games;
	private int last = 0;
	
	public GamePackage(int size) {
		this.games = new Game[size];
	}
	
	public Game getGame(int index) {
		return this.games[index];
	}
	
	public void addGame(Game game) {
		this.games[last] = game;
		last++;
	}
	
	public int getLength() {
		return this.last;
	}

	@Override
	public Iterator iterator() {
		return new GamePackageIterator(this);
	}

//	@Override
//	public String getName() {
//		return games[last].getTitle();
//	}

}
