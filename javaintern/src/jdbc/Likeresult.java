package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Likeresult {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","M1racle@123");
		PreparedStatement st=c.prepareStatement("select *from student where name like '%i' "); 
		//st.setString(1,name);
		ResultSet rs= st.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString(3));
			
		}
	}

}
