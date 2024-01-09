package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsonAL {

	public static void main(String[] args) {
		ArrayList A1=new ArrayList();
		ArrayList A2=new ArrayList();
		A1.add("welcome to miracle");
		A2.add(123);
		A1.add(123);
		A1.removeAll(A2);
		A1.retainAll(A2);
	   System.out.println(A1);
	}}
			

