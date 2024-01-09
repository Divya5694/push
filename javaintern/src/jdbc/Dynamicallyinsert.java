package jdbc;
import java.sql.*;
import java.util.Scanner;



public class Dynamicallyinsert {
	public static void main(String args[])throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the id,name and branch");
		String name=s.nextLine();
		String branch=s.nextLine();
		int id=s.nextInt();
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","M1racle@123");
		PreparedStatement st=c.prepareStatement("insert into student values (?,?,?)");   
		st.setInt(1,id);
		st.setString(2,name);
		st.setString(3, branch);
		st.executeUpdate();
		System.out.println("done");
        c.close();

		
		
		
	}

}
