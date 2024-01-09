package collections;
import java.util.*;

class Student1{
	int age;
	String name;
	Student1(int age,String name){
		this.age=age;
		this.name=name;
		
	}
}
public class Objinlist {

	public static void main(String[] args) {
		Student1 s1=new Student1(20,"tulasi");
		Student1 s2=new Student1(21,"madhavi");
		LinkedList al= new LinkedList();
		al.add(s1);
		al.add(s2);
		Iterator i=al.iterator();
		while(i.hasNext()) {
			Student1 s3= (Student1) i.next();
			System.out.println(s3.age+" "+ s3.name);
		}
			}

}
