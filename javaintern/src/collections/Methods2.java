package collections;

import java.util.ArrayList;

public class Methods2 {

	public static void main(String[] args) {
		ArrayList A3=new ArrayList();
		A3.add(123);
		ArrayList A1=new ArrayList();
		A1.add("arraylist");
		ArrayList A2=new ArrayList();
		A2.add(1234);
		A1.add(A2);
		A2.add("array");
		A2.removeAll(A1);
		System.out.println(A2);
		System.out.println(A1);
		System.out.println(A3);
	}

}
