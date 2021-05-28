package book_example.run;

import book_example.aggreate.concreateAggregate.BookShelf;
import book_example.aggreate.concreateAggregate.GamePackage;
import book_example.iterator.Iterator;
import book_example.model.Book;
import book_example.model.Game;

public class Run {
	
	//iterator ������ ����ϴ� ���� : 
	// concreateIterator ������ �ٲ����..(array�� List�� vector ������ �ٲٴ���..) 
	// �ùٸ� Iterator�� return�Ѵٸ� ������ �ҽ� �ڵ尡 �ٲ��� �ʾƵ� �ȴ�. 
	// (while������ BookShelf��, gamePackage �������� �������� �ʴ´�. hasNext�� next�� �����Ǿ������� ���ư� �� �ִ�)
	// �� Ŭ������ ���̿�ȭ�� ���� �� �� �ִ�.
	// iterator pattern�� ������� �ʾҴٸ� Book�̳� Game�� Ŭ�������� �����׸��� ������ ��������� �߰�����, 
	// concreateIterator�� ���������ν� ���� class�� �ǵ帮�� �ʾƵ� �ȴ� �̸��̴�.

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
        gamePackage.addGame(new Game("������ ���� : �߻��� ����"));
        gamePackage.addGame(new Game("�������� : ���� ����"));
        gamePackage.addGame(new Game("Ʈ������ ���̺��"));
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
