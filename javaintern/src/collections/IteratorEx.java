package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("sai");
		al.add(123);
		al.add("divya");
		al.add(546);
		Iterator i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
