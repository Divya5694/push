package collections;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;

class People2  implements Serializable{
	int age;
	String name;
 People2 (int age,String name) {
	    this.age=age;
		this.name=name;
	}

 public class S1 {

	public static void main(String[] args) throws IOException {
		People2 s1=new People2(1,"java");
		People2 s2=new People2(21,"miracle");
		LinkedList al= new LinkedList();
		al.add(s1);
		al.add(s2);
		FileOutputStream fi=new FileOutputStream("/home/training/ex.txt");
		ObjectOutputStream o=new ObjectOutputStream(fi);				
		o.writeObject(al);
	    o.close();
		fi.close();
		System.out.println("done");
		}
 }
}



