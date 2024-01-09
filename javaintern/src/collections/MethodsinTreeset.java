package collections;
import java.util.*;

public class MethodsinTreeset {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(12);
		ts.add(34);
		ts.add(56);
		TreeSet ts1=new TreeSet();
		ts1.add(78);
		ts1.addAll(ts);
		ts1.remove(34);
		//ts1.removeAll(ts);	
		ts1.retainAll(ts);
		ts1.clear();
		System.out.println(ts1);
		System.out.println(ts.containsAll(ts1));
		
		System.out.println(ts1.contains(34));
		
		System.out.println(ts1.size());
	}

}
