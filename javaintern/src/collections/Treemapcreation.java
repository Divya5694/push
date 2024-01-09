package collections;
import java.util.*;

public class Treemapcreation {

	public static void main(String[] args) {
		TreeMap <Integer,String>t=new TreeMap();
		t.put(121,"aman");
		t.put(13,"roshan");
		t.put(156,"arman");
		TreeMap t1=new TreeMap();
		t1.putAll(t);
		t1.put(167,"shayari");
		for(Map.Entry m:t.entrySet()) {
			System.out.println(m.getKey());
		}

	}

}
