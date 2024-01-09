package practiceeee;

import java.util.Scanner;

public class pppp {

	public static void main(String[] args) {
		int count=0,c=0;
		int sum=0;
		int num=2;
		while(c<=100) {
			count=0;
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			}if(count==2) {
				//sum=sum+num;
				System.out.println(num);
				c++;
			}
			num++;
			//System.out.println(num);
		}
	//	System.out.println(num);
		
		

}
}