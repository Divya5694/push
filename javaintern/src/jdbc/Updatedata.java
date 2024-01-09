package jdbc;
import java.sql.*;
public class Updatedata {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection C= DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","M1racle@123");
		Statement s=C.createStatement();
		s.executeUpdate("update emp2 set emprole= 'intern' where empusername='sdivya'");
		s.close();
		System.out.println("done");
	}

}


