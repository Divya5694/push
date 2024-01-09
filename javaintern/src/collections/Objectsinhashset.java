package collections;
import java.util.*;

class Things{
	String bookname;
	int pages;
  	Things(String bookname,int pages){
  		this.bookname=bookname;
  		this.pages=pages;
  		
  	}
}

public class Objectsinhashset {

	public static void main(String[] args) {
		Things t1=new Things("telugu",100);
		Things t2=new Things("maths",200);
		
		LinkedHashSet hs=new LinkedHashSet();
		//HashSet hs=new HashSet();
		hs.add(t1);
		hs.add(t2);
		Iterator i=hs.iterator();
		while(i.hasNext()) {
			Things t=(Things) i.next();
			System.out.println(t.bookname +" "+t.pages);
			
		}
		
		
	}

}
