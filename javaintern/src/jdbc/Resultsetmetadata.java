package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Resultsetmetadata {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","M1racle@123");
    	PreparedStatement st=c.prepareStatement("select * from employee");
        ResultSet r=st.executeQuery();
        while(r.next()) {
        System.out.println(r.getInt(1));
        }
        ResultSetMetaData rm=r.getMetaData();
        System.out.println(rm.getColumnCount());
        for(int i=1;i<=rm.getColumnCount();i++) {
        	System.out.println(rm.getColumnName(i)+" ");
        }
        	
        
        c.close();
        }
	}



