package collections;
import java.util.*;
import java.util.Map.Entry;
public class Hashmapusingiterator {
	public static void main(String args[]) {
		HashMap hm=new HashMap();
		hm.put(34,"book");
		hm.put(56,"notes");
		hm.put(12,"pen");
		hm.put(90,"pencil");
		Set s=hm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry m1=(Map.Entry)i.next();	
			System.out.println(m1.getKey()+ " "+m1.getValue());
			}
	}	
	}

