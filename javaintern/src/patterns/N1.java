package patterns;

import java.util.Scanner;

public class N1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.println(j+"");
			}
			System.out.println("");
		}
	}

}
