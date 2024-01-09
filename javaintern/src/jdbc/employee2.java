package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
  class Table  {
	  void table2() throws ClassNotFoundException, SQLException {
		 Scanner s=new Scanner (System.in);
		 
			String usernamee=s.nextLine();
			String pword=s.nextLine();
			int empid=s.nextInt();
			System.out.println("Enter username and password");
			Class.forName("com.mysql.cj.jdbc.Driver");
		 	Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","M1racle@123");
		 	PreparedStatement stt=c.prepareStatement("select * from employee where ((Username='"+usernamee+"') and (Password='"+pword+"'))");
		 	ResultSet r= stt.executeQuery();
		 	String dE=r.getString(4);
		 	if(dE.equals("hr")) {
		 		System.out.println("enter your choice 1.insert 2.update 3.view 4.delete");
		 		int choice=s.nextInt();
		 	switch(choice) {
		 	case 1:
		 		System.out.println("INSERT");
		 		System.out.println("enter the firstname,secondname,designation,mblno,id ");
		    	String f=s.nextLine();
		    	String sd=s.nextLine();
		    	String d=s.nextLine();
		    	long mblno=s.nextLong();
		    	//int id=s.nextInt();
		        s.nextLine();
		    	String add= s.nextLine();
	            String b=f.substring(0,1);
		    	String email=b+sd+"@intern.com";
		    	String username= f.charAt(0)+""+sd;
		    	String sb=f.substring(0,2);
		    	String sbb=sd.substring(0,2);
		    	String mm= Long.toString(mblno);
		        String m=mm.substring(5);
		        String password= sb+sbb+m;
		        PreparedStatement st=c.prepareStatement("insert into employee values (?,?,?,?,?,?,?,?,?)");
		    	st.setInt(1,empid);
		    	st.setString(2,f);
		    	st.setString(3, sd);
		    	st.setString(4,d);
		        st.setLong(5,mblno);
		        st.setString(6,email);
		    	st.setString(7, username);
		    	st.setString(8,password);
		    	st.setString(9,add);
		    	st.executeUpdate();
		    	System.out.println("done");
		    	c.close();
		    	break;
		 	case 2:
		 		System.out.println("UPDATE");
		 		String Firstname=s.nextLine();
		 		//int empid=s.nextInt();
		 		PreparedStatement st2=c.prepareStatement("update employee set empid=(?) where Firstname=?");   
				st2.setInt(1,empid);
				st2.setString(2,Firstname);
			    st2.executeUpdate();
				System.out.println("done");
		        c.close();
		        break;
		 	case 3:
		 		System.out.println("VIEW");
		 		System.out.println("enter 1.employee details or 2.personal details");
		 		int details=s.nextInt();
		 		if(details==1) {
		 	PreparedStatement st3=c.prepareStatement("select*from employee");  
		 	ResultSet rs= st3.executeQuery();
			while(rs.next()) {
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
			}
		 		}
		 		else if(details==2) {
					PreparedStatement ps5=c.prepareStatement("select * from employee where empid=?");
					ps5.setInt(1,empid);
					ResultSet rs3=ps5.executeQuery();
					while(rs3.next()) {
						System.out.println(rs3.getInt(1)+" "+rs3.getString(2)+" "+rs3.getString(3)+" "+rs3.getString(4)+" "+rs3.getLong(5)+" "+rs3.getString(6)+" "+rs3.getString(7)+" "+rs3.getString(8)+" "+rs3.getString(9)+"");
					}
				}
           else if(dE.equals("trainer")) {
	PreparedStatement ps6=c.prepareStatement("select * from employee where EmployeeID=?");
	ps6.setInt(1,empid);
	ResultSet rs4=ps6.executeQuery();
	          while(rs4.next()) {
		System.out.println(rs4.getInt(1)+" "+rs4.getString(2)+" "+rs4.getString(3)+" "+rs4.getString(4)+" "+rs4.getLong(5)+" "+rs4.getString(6)+" "+rs4.getString(7)+" "+rs4.getString(8)+" "+rs4.getString(9)+"");
	}	
}
else if(dE.equals("trainee")) {
	System.out.println("Enter option 1.Update and 2.View");
	int option1=s.nextInt();
	switch(option1) {
	case 1:
		System.out.println("data update");
		System.out.println("Enter employee id and mblno");
		//id=s.nextInt();
		  long empMblno=s.nextLong();
		PreparedStatement ps2=c.prepareStatement("update employee set empMblno=? where empid=?");
		ps2.setLong(1,empMblno);
		ps2.setInt(2,empid);
		ps2.executeUpdate();
		break;
	case 2:
		PreparedStatement ps5=c.prepareStatement("select * from employee where empid=?");
		empid=s.nextInt();
		ps5.setInt(1,empid);
		ResultSet rs5=ps5.executeQuery();
		while(rs5.next()) {
			System.out.println(rs5.getInt(1)+" "+rs5.getString(2)+" "+rs5.getString(3)+" "+rs5.getString(4)+" "+rs5.getLong(5)+" "+rs5.getString(6)+" "+rs5.getString(7)+" "+rs5.getString(8)+" "+rs5.getString(9)+"");
		}
		break;
	}
			}
		 		}
		 	}
		 	}
	  }
  
  
public class employee2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Table t=new Table();
		t.table2();
	 	}
}

  
	 
  
  
