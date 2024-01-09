package javaintern;

import java.util.Scanner;

public class Example {
	public void choice() throws ArithmeticException {
   int balance=5000;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter your choice");
   System.out.println("1.deposit 2.withdraw  3.balance  4.exit ");

      int choice1=sc.nextInt();
      //System.out.println("1.deposit 2.withdraw  3.balance  4.exit ");
                 if(choice1==1) {
			System.out.println("DEPOSIT");
			System.out.println("ENTER THE DEPOSIT AMOUNT");
			//Scanner sc=new Scanner(System.in);
			int damount=sc.nextInt();
			
			if(damount<500) {
				throw new ArithmeticException ("enter amount more than 500");}
			else {
				System.out.println("the total balance is : " +(balance+damount));
			}
			
		}
		if(choice1==2) {
			//Scanner sc=new Scanner(System.in);
			
			System.out.println("WITHDRAW");
			System.out.println("enter the withdraw amount");
			int wamount=sc.nextInt();
			if(wamount>balance) {
				throw new ArithmeticException("balance is low");
				
			}
			else {
				System.out.println("the total balance is : " + (balance-wamount));}
		}
			if(choice1==3) {
			  System.out.println("BALANCE");
			  Scanner sc1=new Scanner(System.in);
				
				
             System.out.println("enter the username");
             String username =sc1.nextLine();
             System.out.println("enter the password");
             int password=sc1.nextInt();
             if((username.equals("SBI")) && password == 123) {
            	 System.out.println(+balance);
             }else {
            	 System.out.println("invalid username and password"); }
			}
			if(choice1==4) {
				System.out.println("EXIT");
				System.out.println("thankyou visitagain !");
			}
		}
	
			public static void main(String[] args) throws ArithmeticException {
				Example obj=new Example();
				obj.choice();
								}
	
}

