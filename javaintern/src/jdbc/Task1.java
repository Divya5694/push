package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the fname,s name and username");
		String fname= s.nextLine();
		String sname=s.nextLine();
		String uname=s.nextLine();
		Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","M1racle@123");
PreparedStatement st=c.prepareStatement("select * from employee where ((empFirstname like '"+fname+"%') and (empSecondname like'"+sname+"%') and (empUsername like '"+uname+"%'))");
        ResultSet r=st.executeQuery();
        while(r.next()) {
        	System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3)+" "+r.getString(4)+" "+r.getString(5)+" "+r.getString(6)+" "+r.getString(7)+" "+r.getString(8));
        }
		
	}

}
