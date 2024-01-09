package practiceeee;

import java.util.Scanner;

public class perfectno {

	public static void main(String[] args) {
		int r=0,i;
		int num=1,count=0,c=0;
		while(c<=100) {
		//for( i=1;i<=num;i++) {
			r=0;
			for(int j=1;j<num;j++) {
				
			if(num%j==0) {
			r=r+j;
			//c++;
			//num=num/10;
		}
		}
		
   if(num==r) {
	   
	   System.out.println(num);
	   c++;
	   
   }
   }num++;
	}
}
	

