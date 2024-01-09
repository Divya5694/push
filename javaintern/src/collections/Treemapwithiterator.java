package collections;
import java.util.*;
import java.util.Map.Entry;

public class Treemapwithiterator {

	public static void main(String[] args) {
		TreeMap t= new TreeMap();
		t.put(123,"sai");
		t.put(45465,"divya");
		t.put(344,"tulasi");
		Set s= t.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry m= (Map.Entry)i.next();
			System.out.println(m.getKey()+ " "+ m.getValue());
		}
	}

}
  