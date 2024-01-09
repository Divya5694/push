package practiceeee;

import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		int n = 0;
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
      //  String s=sc.next();
        
        for(int i=1;i>=n;i++){
        	String s=sc.nextLine();
        	if(s!="") {
        	System.out.println(i + s);
        }
	}
	}
}
