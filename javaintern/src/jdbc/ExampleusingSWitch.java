package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class ExampleusingSWitch {

	public static void main(String[] args) throws Exception{
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter your choice");
		int select=s.nextInt();
		System.out.println("enter the firstname,secondname,designation,mblno,id ");
		    	String f=s.nextLine();
		    	String sd=s.nextLine();
		    	String d=s.nextLine();
		    	long mblno=s.nextLong();
		    	int id=s.nextInt();
		    	//String email=f.charAt(0)+sd+"@intern.com";
		    	String b=f.substring(0,1);
		    	String email=b+sd+"@intern.com";
		    	String username= f.charAt(0)+""+sd;
		    	String sb=f.substring(0,2);
		    	String sbb=sd.substring(0,2);
		    	String mm= Long.toString(mblno);
		        String m=mm.substring(5);
		        String password= sb+sbb+m;
		    	
		    	
	Class.forName("com.mysql.cj.jdbc.Driver");
    Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","M1racle@123");
   // System.out.println("enter your choice");
       //int select=s.nextInt();
       switch(select) {
       case 1:
       
		    	PreparedStatement st=c.prepareStatement("insert into employee values (?,?,?,?,?,?,?,?)");
		    	st.setInt(1,id);
		    	st.setString(2,f);
		    	st.setString(3, sd);
		    	st.setString(4,d);
		        st.setLong(5,mblno);
		        st.setString(6,email);
		    	st.setString(7, username);
		    	st.setString(8,password);
		    	st.executeUpdate();
		    	System.out.println("done");
		    //	c.close();
		    	
       
       case 2:
    	   
    	   PreparedStatement st1=c.prepareStatement("Update employee set second name=? where id=?");
   	st1.setInt(1,id);
   	//st.setString(2,f);
    	st1.setString(3, sd);
//   	st.setString(4,d);
//     st.setLong(5,mblno);
//     st.setString(6,email);
//   	st.setString(7, username);
//   	st.setString(8,password);
   	st1.executeUpdate();
   	System.out.println("done");
   	
       }
		    }
		

	}


