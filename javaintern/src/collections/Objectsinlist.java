package collections;

import java.util.*;
import java.util.Iterator;

 class Student {
	int age;
	String name;
  Student(int age,String name) {//constructor//
		this.age=age;
		this.name=name;
	}
 }
public class Objectsinlist{
		public static void main(String[] args) {
			Student o1=new Student (20,"sai");
			Student o2=new Student(19,"divya"); 
			ArrayList al=new ArrayList();
			al.add(o1);
		al.add(o2);
		Iterator i=al.iterator();
		while(i.hasNext()) {
			Student O3=(Student)i.next();
			System.out.println(O3.age + " "+ O3.name);
		}
	}
}

