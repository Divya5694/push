package empppp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
class role{
     String role;
	int id;long mblno;
	void roleee() throws ClassNotFoundException, SQLException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the empid and pword");
		String password=sc.nextLine();
		int empid=sc.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","M1racle@123");
		PreparedStatement ps=c.prepareStatement("select * from emp2 where empid=? and emppassword=?");
		ps.setInt(1,empid);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			role=rs.getString(4);
		}
		System.out.println(role);
		if(role.equals("hr")) {
			System.out.println("Enter the option 1.Insert 2.Update 3.Delete 4.View");
			int option=sc.nextInt();
			switch(option) {
			case 1: 
				System.out.println("Insert");
				System.out.println("Enter empfname,sname, designation, addby, empid and mblno");
				String AddBy=sc.nextLine();
				String Firstname=sc.nextLine();
				String Lastname=sc.nextLine();
				String designation=sc.nextLine();
				int id=sc.nextInt();
				long phonenumber=sc.nextLong();
				String Email=Firstname.charAt(0)+""+Lastname+"@intern.com";
				String Username = Firstname.charAt(0)+""+Lastname+"";
				String s=Firstname.substring(0,2);
				String s1=Lastname.substring(0,2);
				String n=Long.toString(mblno);
				String s2=n.substring(5);
				String Password=s+""+s1+""+s2+"";
				PreparedStatement ps1=c.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?,?)");
				ps1.setInt(1, id);
				ps1.setString(2, Firstname);
				ps1.setString(3, Lastname);
				ps1.setString(4, designation);
				ps1.setLong(5,phonenumber);
				ps1.setString(6, Email);
				ps1.setString(7, Username);
				ps1.setString(8, Password);
				ps1.setString(9, AddBy);
				ps1.executeUpdate();
				break;
			case 2:
				System.out.println("data update");
				System.out.println("Enter employee id and mblno");
				id=sc.nextInt();
				phonenumber=sc.nextLong();
				PreparedStatement ps2=c.prepareStatement("update employee set Gmail=? where empid=?");
				ps2.setLong(1,phonenumber);
				ps2.setInt(2,id);
				ps2.executeUpdate();
				break;
			case 3:
				System.out.println("Delete the data");
				System.out.println("Enter empid");
				id=sc.nextInt();
				PreparedStatement ps3=c.prepareStatement("delete from employee where empid=?");
				ps3.setLong(1,id);
				ps3.executeUpdate();
				System.out.println("DONE");
				break;
			case 4:
				System.out.println("View the data");
				System.out.println("Enter details 1.empdetails and 2.personaldetails");
				int detail=sc.nextInt();
				if(detail==1) {
					PreparedStatement ps4=c.prepareStatement("select * from employee");
					ResultSet rs2=ps4.executeQuery();
					while(rs2.next()) {
						System.out.println(rs2.getInt(1)+" "+rs2.getString(2)+" "+rs2.getString(3)+" "+rs2.getString(4)+" "+rs2.getLong(5)+" "+rs2.getString(6)+" "+rs2.getString(7)+" "+rs2.getString(8)+" "+rs2.getString(9)+"");
					}
				}
				else if(detail==2) {
					PreparedStatement ps5=c.prepareStatement("select * from employee where empid=?");
					ps5.setInt(1,empid);
					ResultSet rs3=ps5.executeQuery();
					while(rs3.next()) {
						System.out.println(rs3.getInt(1)+" "+rs3.getString(2)+" "+rs3.getString(3)+" "+rs3.getString(4)+" "+rs3.getLong(5)+" "+rs3.getString(6)+" "+rs3.getString(7)+" "+rs3.getString(8)+" "+rs3.getString(9)+"");
					}
				}
				else
					System.out.println("Enter correct choice");
				break;
				default:
					System.out.println("Enter choice from 1 to 4");
					System.exit(0);
				}
			System.exit(0);
			}
		else if(role.equals("trainer")) {
			PreparedStatement ps6=c.prepareStatement("select * from employee where empid=?");
			ps6.setInt(1,empid);
			ResultSet rs4=ps6.executeQuery();
			while(rs4.next()) {
				System.out.println(rs4.getInt(1)+" "+rs4.getString(2)+" "+rs4.getString(3)+" "+rs4.getString(4)+" "+rs4.getLong(5)+" "+rs4.getString(6)+" "+rs4.getString(7)+" "+rs4.getString(8)+" "+rs4.getString(9)+"");
			}	
		}
		else if(role.equals("intern")) {
			System.out.println("Enter option 1.Update and 2.View");
			int option1=sc.nextInt();
			switch(option1) {
			case 1:
				System.out.println("data update");
				System.out.println("Enter empid and mblno");
				id=sc.nextInt();
				long mblno=sc.nextLong();
				PreparedStatement ps2=c.prepareStatement("update employee set mblno=? where empid=?");
				ps2.setLong(1,mblno);
				ps2.setInt(2,id);
				ps2.executeUpdate();
				System.out.println("done");
				break;
			case 2:
				System.out.println("view");
				PreparedStatement ps5=c.prepareStatement("select * from employee where empid=?");
				ps5.setInt(1,empid);
				ResultSet rs5=ps5.executeQuery();
				while(rs5.next()) {
					System.out.println(rs5.getInt(1)+" "+rs5.getString(2)+" "+rs5.getString(3)+" "+rs5.getString(4)+" "+rs5.getLong(5)+" "+rs5.getString(6)+" "+rs5.getString(7)+" "+rs5.getString(8)+" "+rs5.getString(9)+"");
				}
				break;
				
			}
		}
		else
		{
			System.out.println("Enter valid details");
			System.exit(0);
		}
}

}
public class employee {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		role d=new role();
		d.roleee();
	}		

}
