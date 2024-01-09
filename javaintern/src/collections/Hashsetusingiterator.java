package collections;
import java.util.*;

public class Hashsetusingiterator {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("saidivya");
		hs.add(123);
		hs.add("madhavi");
		hs.add(456);
		Iterator i=hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
