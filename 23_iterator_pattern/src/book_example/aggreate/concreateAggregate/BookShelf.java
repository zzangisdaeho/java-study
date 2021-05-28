package book_example.aggreate.concreateAggregate;

import book_example.aggreate.Aggregate;
import book_example.iterator.Iterator;
import book_example.iterator.concreateIterator.BookShelfIterator;
import book_example.model.Book;

public class BookShelf implements Aggregate{
    private Book[] books;
    private int last = 0;
    public BookShelf(int maxsize){
        this.books = new Book[maxsize];
    }
    public Book getBookAt(int index){
        return books[index];
    }
    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }
    public int getLength(){
        return last;
    }
    @Override
    public Iterator iterator(){
        return new BookShelfIterator(this);
    }
//	@Override
//	public String getName() {
//		return this.books[last].getName();
//	}
}