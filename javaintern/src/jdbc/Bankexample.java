package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
 class Transactions {
	 int balance=0 ;
		int count=1;
		long acc=0,pd=0;
	public void choice() throws SQLException, ClassNotFoundException {	
		Scanner s=new Scanner (System.in);
	System.out.println("enter account number");
		long accnumber=s.nextLong();
		s.nextLine();
		System.out.println("enter your password");
		long pword=s.nextLong();
		Class.forName("com.mysql.cj.jdbc.Driver");
 	Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","M1racle@123");
    PreparedStatement stt=c.prepareStatement("select * from transactions where ((accountno='"+accnumber+"') and (password='"+pword+"'))");
     ResultSet rr=stt.executeQuery();
     while(rr.next()) {
     acc=rr.getLong(1);
     pd=rr.getLong(2);}
     while(count<3) {
    if((accnumber==acc)&&(pword==pd)){
     	System.out.println("enter your choice 1. deposit 2.withdraw 3.balance 4. Transfer 5.exit");
 		int choice=s.nextInt();
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
    PreparedStatement sta=c.prepareStatement("update transactions set balance = '"+b2+"' where (accountno= '"+accnumber+"')");
    sta.executeUpdate();
    }
			}
		      break;
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
                      System.out.println(b3);
                      PreparedStatement stb=c.prepareStatement("update transactions set balance ='"+b3+"' where (accountno='"+accnumber+"')");
                      stb.executeUpdate();
                    }	
	}
				break;
	
 case 3:
     	System.out.println("BALANCE");
 	PreparedStatement st2=c.prepareStatement("select * from transactions where ((accountno='"+accnumber+"') and (password='"+pword+"'))");
         ResultSet r2=st2.executeQuery();
        while(r2.next()) {
     	   balance=(r2.getInt(3));
        	 System.out.println(balance);
     }
        break;
 case 4:
 	System.out.println("TRANSFER");
 	System.out.println("enter the account number to transfer money");
 	long tf=s.nextLong();
 	PreparedStatement st3=c.prepareStatement("select * from transactions where (accountno='"+tf+"')");
 	System.out.println("enter the money to transfer");
    long tfm=s.nextLong();
 	 ResultSet r3=st3.executeQuery();
 	// while(r3.next()) {
// 		 balance=(r3.getInt(3));
// 	 long bbb=(balance+tfm);
// 		PreparedStatement stc=c.prepareStatement("update transactions set balance = '"+bbb+"' where (accountno= '"+accnumber+"')");
// 	 stc.executeUpdate();
 		while(r3.next()) {
 			balance=(r3.getInt(3));
 		 	 long bbb=(balance+tfm);
 		 		PreparedStatement stc=c.prepareStatement("update transactions set balance = '"+bbb+"' where (accountno= '"+accnumber+"')");
 		 	 stc.executeUpdate();
 		PreparedStatement st4=c.prepareStatement("select * from transactions where ((accountno='"+accnumber+"') and (password='"+pword+"'))");
         ResultSet r4=st4.executeQuery();
         while(r4.next()) {
         	int balanceb=(r4.getInt(3));
           long b4=(balanceb-tfm);
PreparedStatement sta=c.prepareStatement("update transactions set balance = '"+b4+"' where (accountno= '"+accnumber+"')");
 	 	sta.executeUpdate();
 		
 	System.out.println("the amount to be debited from your account is "+ tfm);
 	System.out.println("the remaining balance in your account "+b4);
// 	PreparedStatement sta=c.prepareStatement("update transactions set balance = '"+b4+"' where (accountno= '"+accnumber+"')");
// 	sta.executeUpdate();
         }
 		}
         break;    
     	
 case 5:
	 
 	System.out.println("EXITING");
 	System.exit(0);
 	  
	}
     }
    
    else {
 	   count++;
 	   System.out.println("invalid details");
 	   choice();
    }
    System.exit(0);
 
     if(count==3) {
    	 System.exit(0);
     }
     }	}
 }
	 public class Bankexample {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Transactions t=new Transactions();
		t.choice();
	}	
	}
	
 
		