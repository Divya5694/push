package collections;

import java.util.HashSet;

public class HashsetExample {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("adding values to hashset");
		hs.add(123);
		hs.add("abc");
		hs.add(123);
		//hs.remove(123);
		//System.out.println(hs.size());
	//	hs.clear();
		//System.out.println();
		//System.out.println(hs);
      HashSet hs1=new HashSet();
       hs1.add(123);
     hs1.add("abc");
 System.out.println(hs1);
 //hs.removeAll(hs1);
 hs.retainAll(hs1);
 System.out.println(hs);
	}
	

}
