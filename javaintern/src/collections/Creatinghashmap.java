package collections;
import java.util.*;
//import java.util.Map.Entry;

public class Creatinghashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new<Integer,String> HashMap();
		HashMap hm2=new HashMap();
		hm.put(121,"sai");
		hm.put(656,"divya");
		hm.put(324,"madhu");
		hm2.putAll(hm);
		hm2.remove(324);
		System.out.println(hm2);
		System.out.println(hm.containsKey(656));
		System.out.println(hm.containsValue("mad"));
		for( Map.Entry m1: hm.entrySet()){
			System.out.println(m1.getKey()+" : "+ m1.getValue());
		}
		
		
	}

}

