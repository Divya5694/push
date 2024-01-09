package collections;
import java.util.*;
import java.util.Map.Entry;
   class Book {
	   int pages;
	   String size;
	Book (int pages,String size){
	
		this. pages=pages;
		this.size=size;
	}
   }
public class Objectsinmap {

	public static void main(String[] args) {
	Book b=new Book(200,"large");
	Book b1=new Book(150,"medium"); 
		HashMap hm= new HashMap();
		  hm.put(3, b1);
		  hm.put(4, b);
		  //for(Map.Entry m1:hm.entrySet()) {
		  Set s=hm.entrySet();
			Iterator i=s.iterator();
			while(i.hasNext()) {
				Map.Entry m1=(Entry<Integer, Book>)i.next();
				Book b3=(Book) m1.getValue();
						System.out.println(b3.pages + " "+b3.size);
						}
			}	  
	}


