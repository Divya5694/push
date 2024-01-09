package jdbc;
import java.sql.*;

public class Deletedata {
	public static void main (String args[]) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","M1racle@123");
		Statement ds= c.createStatement();
		ds.executeUpdate("delete from student where name='anusha'");
		ds.close();
		System.out.println("done");
	}
	
	

}
