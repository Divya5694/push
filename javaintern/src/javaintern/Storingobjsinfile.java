package javaintern;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;



class Student implements Serializable{
	int rollno;
	String name;

	Student(int rollno,String name){
		this.name=name;
		this.rollno=rollno;
	}
	
}

public class Storingobjsinfile {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fs= new FileOutputStream("/home/training/new.txt");
		Student s=new Student(12,"saidivya");
		Student s1=new Student(18,"madhavi");
				
		ObjectOutputStream o=new ObjectOutputStream(fs);
		o.writeObject(s);
		o.writeObject(s1);
		o.close();
		fs.close();
		System.out.println("done");
	}	  
 

  }
		
	


