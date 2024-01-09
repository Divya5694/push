package collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

        
	public class Objectserializable {
			public static void main(String[] args) throws IOException {
			   LinkedList al= new LinkedList();
				al.add("saidivya");
				al.add("madhavi");
				FileOutputStream fi=new FileOutputStream("/home/training/obj.txt");
				ObjectOutputStream o=new ObjectOutputStream(fi);				
				o.writeObject(al);
			    o.close();
				fi.close();
				System.out.println("done");
				
				}
						}


