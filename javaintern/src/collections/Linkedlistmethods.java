package collections;
import java.util.*;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistmethods {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(0);
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ListIterator i=ll.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
		System.out.println( ll);
           System.out.println( ll.getFirst());
           System.out.println( ll.getLast());
           //System.out.println(ll.clear());
	}

}
