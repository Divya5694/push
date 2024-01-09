package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListiteratorEx {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("adding data to al");
		al.add(1213);
		ListIterator li=al.listIterator();
	while(li.hasNext()) {
			System.out.println("the  order is:" +li.next());
		}
	 while(li.hasPrevious()) {
	 System.out.println("the reverse order is " +li.previous());
	 }
	}
		
	}


