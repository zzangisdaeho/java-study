//package book_example.broker;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//
//import book_example.aggreate.Aggregate;
//
//public class IteratorBroker {
//
//	ArrayList<Aggregate> list;
//
//	public IteratorBroker(ArrayList<Aggregate> list) {
//
//		this.list = list;
//
//	}
//
//	public void printList() {
//
//		Iterator<Aggregate> listIterator = list.iterator();
//
//		while (listIterator.hasNext()) {
//
//			Aggregate aggregate = listIterator.next();
//			
//			printList(aggregate.iterator());
//			
//			System.out.println("===================================");
//
//		}
//
//	}
//
//	private void printList(book_example.iterator.Iterator iterator) {
//
//		while (iterator.hasNext()) {
//
//			Aggregate each = (Aggregate) iterator.next();
//
//			System.out.println(each.getName());
//
//
//		}
//
//	}
//}
