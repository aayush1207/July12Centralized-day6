package Assignment7;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) 
	{
		int value;
		int i, fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for factorial");
		value=sc.nextInt();
		for(i=1;i<=value;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+value+" is: "+fact);    
		 }  
		
	}


