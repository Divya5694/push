package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Resultdynamic {

	public static void main(String[] args)throws Exception {
		Scanner s=new Scanner(System.in);
	System.out.println("enter the id");
	int id=s.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","M1racle@123");
		PreparedStatement st=c.prepareStatement("SELECT empGmail from employee where empid= ?"); 
		st.setInt(1, id);
		ResultSet rs= st.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("empGmail"));
		
		}
	}

}
