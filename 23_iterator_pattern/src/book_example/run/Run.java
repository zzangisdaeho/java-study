package book_example.run;

import book_example.aggreate.concreateAggregate.BookShelf;
import book_example.aggreate.concreateAggregate.GamePackage;
import book_example.iterator.Iterator;
import book_example.model.Book;
import book_example.model.Game;

public class Run {
	
	//iterator 패턴을 사용하는 이유 : 
	// concreateIterator 구현이 바뀌더라도..(array를 List나 vector 등으로 바꾸더라도..) 
	// 올바른 Iterator를 return한다면 나머지 소스 코드가 바뀌지 않아도 된다. 
	// (while루프는 BookShelf나, gamePackage 구현에는 의존하지 않는다. hasNext와 next만 구현되어있으면 돌아갈 수 있다)
	// 즉 클래스의 재이용화를 촉진 할 수 있다.
	// iterator pattern을 사용하지 않았다면 Book이나 Game의 클래스에서 구현항목을 일일히 수정해줘야 했겠지만, 
	// concreateIterator만 수정함으로써 기존 class는 건드리지 않아도 된다 이말이다.

	public static void main(String[] args){
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator it = bookShelf.iterator();
        while(it.hasNext()){
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
        
        GamePackage gamePackage = new GamePackage(3);
        gamePackage.addGame(new Game("젤다의 전설 : 야생의 숨결"));
        gamePackage.addGame(new Game("영웅전설 : 섬의 궤적"));
        gamePackage.addGame(new Game("트리오브 세이비어"));
        Iterator gameIterator = gamePackage.iterator();
        while(gameIterator.hasNext()){
        	Game game = (Game)gameIterator.next();
        	System.out.println(game.getTitle());
        }
        
//        System.out.println("============================");
//        
//        ArrayList<Aggregate> brokeList = new ArrayList<Aggregate>();
//        brokeList.add(gamePackage);
//        brokeList.add(bookShelf);
//        IteratorBroker broker = new IteratorBroker(brokeList);
//        
//        broker.printList();
    }

}
