//To check number is Prime or not

package Assignment3;

import java.util.Scanner;

public class primenumber {
	public static void main(String[] args) 
	{
		int a;
		boolean isPrime=true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked as Prime or Non Prime");
		a = sc.nextInt();
		int i=2;
		while(i<=a/2)
		{
			if(a % i == 0)
			   {
				isPrime = false;
				break;
			   }
			   i++;
		}
				if(isPrime)
					   System.out.println(a + " is a Prime Number");
					else
					   System.out.println(a + " is not a Prime Number");
				   }
				}



	
	


