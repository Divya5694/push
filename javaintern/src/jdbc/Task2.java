package jdbc;
import java.sql.*;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		int balance=0 ;
		Scanner s=new Scanner (System.in);
	System.out.println("enter account number");
		long accnumber=s.nextLong();
		s.nextLine();
		System.out.println("enter your password");
		String pword=s.nextLine();
            // int choice=s.nextInt();
		System.out.println("enter your choice 1. deposit 2.withdraw 3.balance 4. Transfer 5.exit");
		int choice=s.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","M1racle@123");
		switch(choice) {
		case 1:
			System.out.println("DEPOSIT");
			System.out.println("ENTER THE AMOUNT TO BE DEPOSITED");
             int damount=s.nextInt();
		      if(damount<1000) {
			throw new ArithmeticException ("enter amount more than 1000");}
			else {
PreparedStatement st=c.prepareStatement("select * from transactions where ((accountno='"+accnumber+"') and (password='"+pword+"'))");
        ResultSet r=st.executeQuery();
        while(r.next()) {
       double b2=damount+r.getDouble(3);
       System.out.println(b2);
       }
			}
        case 2:
		      System.out.println("WITHDRAW");
			 System.out.println("enter the withdraw amount");
				int wamount=s.nextInt();
				if(wamount>1000) {					
				throw new ArithmeticException("balance is low");
	}			else {
PreparedStatement st1=c.prepareStatement("select * from transactions where ((accountno='"+accnumber+"') and (password='"+pword+"'))");
                      ResultSet r1=st1.executeQuery();
                       while(r1.next()) {
                       int b3=(r1.getInt(3)-wamount);
                          // System.out.println(r1.getDouble(3));
                       System.out.println(b3);
                       }
                       }	
    case 3:
        	System.out.println("BALANCE");
    	PreparedStatement st2=c.prepareStatement("select * from transactions where ((accountno='"+accnumber+"') and (password='"+pword+"'))");
            ResultSet r2=st2.executeQuery();
           while(r2.next()) {
        	   balance=(r2.getInt(3));
           	 System.out.println(balance);
        }
    case 4:
    	System.out.println("TRANSFER");
    	System.out.println("enter the account number to transfer money");
    	long tf=s.nextLong();
    	PreparedStatement st3=c.prepareStatement("select * from transactions where (accountno='"+tf+"')");
    	System.out.println("enter the money to transfer");
    	long tfm=s.nextLong();
        ResultSet r3=st3.executeQuery();
    	while(r3.next()) {
    		PreparedStatement st4=c.prepareStatement("select * from transactions where ((accountno='"+accnumber+"') and (password='"+pword+"'))");
            ResultSet r4=st4.executeQuery();
            while(r4.next()) {
            	balance=(r4.getInt(3));
            }
    		long b4=(balance-tfm);
    		//System.out.println(b4);
    	System.out.println("the amount to be debited from your account is "+ tfm);
    	System.out.println("the remaining balance in your account "+b4);
    	}
                
        	
    case 5:
    	System.out.println("EXITING");
    	System.exit(0);
    	  
	}
	    
		}
		
	}
