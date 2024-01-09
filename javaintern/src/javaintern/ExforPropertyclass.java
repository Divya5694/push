package javaintern;
import java.util.*;
import java.io.*;

public class ExforPropertyclass {
	public static void main(String args[])throws Exception {
		FileOutputStream fo= new FileOutputStream("/home/training/propety.properties");
		Properties p = new Properties();
		p.setProperty("name" ,"sai");
		p.setProperty("age","twenty");
		 p.store(fo,"done");
 System.out.println("completed");
    FileInputStream fi=new FileInputStream("/home/training/propety.properties");
  Properties p1=new Properties();
  p1.load(fi);
   String a= p1.getProperty("name");
 String b=p1.getProperty("age");
   System.out.println(a + " "+b);
	}

}
