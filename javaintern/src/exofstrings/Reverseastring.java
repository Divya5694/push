package exofstrings;
import java.util.*;

public class Reverseastring {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the string");
		String s= sc.nextLine();
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
		
			//System.out.println("CHECKING FOR PALINDROME OR NOT");
			reverse= reverse+s.charAt(i);
		}
		
			if(s.equals(reverse)) {
				System.out.println("it's a palindrome");

			}
			else {
				
				System.out.println("not a palindrome");
			}
			
		}
	}

