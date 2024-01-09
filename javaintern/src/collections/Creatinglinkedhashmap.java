package collections;
import java.util.*;

public class Creatinglinkedhashmap {

	public static void main(String[] args) {
		LinkedHashMap <Integer,String>lh=new LinkedHashMap();
		lh.put(1,"krishna");
		lh.put(2,"nandhu");
		lh.put(3,"murari");
		LinkedHashMap lh1=new LinkedHashMap();
		lh1.putAll(lh);
		lh1.put(4,"kanna");
		System.out.println(lh1);
		System.out.println(lh1.containsValue(lh));
		lh1.clear();
		System.out.println(lh1.isEmpty());
		for(Map.Entry m1:lh.entrySet()) {
			System.out.println(m1.getKey()+":");
			System.out.println(m1.getValue());
		}
		
	}

}
