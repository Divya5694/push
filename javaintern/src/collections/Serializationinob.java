package collections;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;


public class Serializationinob implements Serializable {

	public static void main(String[] args) throws IOException {
		LinkedList al= new LinkedList();
		al.add("1234");
		al.add("5678");
		FileOutputStream fi=new FileOutputStream("/home/training/object.txt");
		ObjectOutputStream o=new ObjectOutputStream(fi);				
		o.writeObject(al);
	    o.close();
		fi.close();
		System.out.println("done");

	}

}
