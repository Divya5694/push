package collections;
import java.util.*;
public class TreesetEx {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(123);
		ts.add(456);
		ts.add(789);
		ts.add(100);
	
		Iterator i= ts.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
				}
	}

}
