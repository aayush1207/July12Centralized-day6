//To check number is palindrome or not

package Assignment4;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) 
	{
		int n,t,r,s=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to be checked for Palindrome");
		n=sc.nextInt();
		t=n;
		while(n>0)
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(t==s)
		System.out.println("The number is Palindrome");
		else
			System.out.println("The number is not Palindrome");
				
	}

}
