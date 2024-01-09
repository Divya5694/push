package collections;

import java.util.ArrayList;

public class Nongenricex {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(56);
		al.add("college");
		al.add("non generic means we can add any data type as we are not declaring any datatype to the arraylist" );
		for(int i=0;i< al.size();i++) {
		System.out.println(i);
	}
	}
}
