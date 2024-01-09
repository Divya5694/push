package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertdata {
	public static void main(String args[])  {
		//load the driver;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("sucess");
		//establishing the connection
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","M1racle@123");
	      System.out.println("done");
	      // creating the statement
	      Statement s=c.createStatement();
	      s.executeUpdate("insert into emp2 values(4567,'naleti','nail67890','trainer')");
	      System.out.println("ok");
	      c.close();
		
	      
				
	} catch (SQLException |ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	
	
	
	}

}