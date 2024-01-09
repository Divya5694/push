package javaintern;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.LinkedList;

public class  Objdeserialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fi=new FileInputStream("/home/training/object.txt");
		ObjectInputStream o1=new ObjectInputStream(fi);
		LinkedList <String>al1=new LinkedList();
		al1=(LinkedList<String>)o1.readObject();
		Iterator i=al1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		
		//for(String o:al1) {
			//System.out.println(o);
			
		}
	
		fi.close();
        o1.close();
	}
}

