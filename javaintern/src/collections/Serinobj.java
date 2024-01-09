package collections;
import java.util.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;

class People {
	int age;
	String name;
 People (int age,String name) {//constructor//
		this.age=age;
		this.name=name;
	}

public class Serinobj implements Serializable{

	public static void main(String[] args) throws IOException {
		Student1 s1=new Student1(20,"tulasi");
		Student1 s2=new Student1(21,"madhavi");
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


