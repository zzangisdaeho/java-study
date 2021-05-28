package book_example.iterator.concreateIterator;

import book_example.aggreate.concreateAggregate.BookShelf;
import book_example.iterator.Iterator;

public class BookShelfIterator implements Iterator{
    private BookShelf bookShelf;
    private int index;
    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf=bookShelf;
        this.index = 0;
    }
    @Override
    public boolean hasNext(){
        if(index<bookShelf.getLength()){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public Object next(){
        Object book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}