package collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;

public class D1 {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
	FileInputStream fo=new FileInputStream("/home/training/ex.txt");
	ObjectInputStream oi= new ObjectInputStream(fo);
	LinkedList al=new LinkedList();
	al=(LinkedList)oi.readObject();
	for(Object o:al) {
	 People2 d=(People2)o;
		System.out.println(d.age + " "+d.name);
		
	}
	fo.close();
    oi.close();
	
	}

}
