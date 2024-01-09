package collections;

import java.util.LinkedHashSet;

public class LinkedHashsetEx {

	public static void main(String[] args) {
		LinkedHashSet lh=new LinkedHashSet();
		lh.add("adding elements to linkedhashset");
		lh.add(123);
		LinkedHashSet lh1=new LinkedHashSet();
		lh1.add("second linked list");
		lh1.addAll(lh);
		//lh1.remove(123);
		//lh1.removeAll(lh);
		//lh1.clear();
		lh1.retainAll(lh);
		System.out.println(lh1.contains(123));
		System.out.println(lh1.size());
		System.out.println(lh1.containsAll(lh));
		System.out.println(lh1);
		
	}

}
