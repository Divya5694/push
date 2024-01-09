package collections;
import java.util.*;

public class LinkedHashmapwithiterator {

	public static void main(String[] args) {
		LinkedHashMap <Integer,String>lh=new LinkedHashMap();
		 lh.put(2,"sai");
		 lh.put(3,"divya");
		 Set s1=lh.entrySet();
		 Iterator i=s1.iterator();
		 while(i.hasNext()) {
			 Map.Entry m=(Map.Entry)i.next();
			 System.out.println(m.getKey() +" "+ m.getValue());
		 }
		
	}

}
