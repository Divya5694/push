package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Creatingarraylist {

	public static void main(String[] args) {
		ArrayList Al=new ArrayList();
		ArrayList Al1=new ArrayList();
		Al.add(12);
		Al.add(11);
		//Al1.add("saidivya");
		ListIterator li= Al.listIterator();
		//System.out.println(Al.size());
		//System.out.println(Al1);
        while(li.hasNext()) {
        	System.out.println(li.next());
        	
        }
	}

}
