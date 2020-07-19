//Armstrong Number Java Program

package Assignment5;

import java.util.Scanner;

public class armstrong {
	public static void main(String[] args) 
	{
	      int x,y,z,sum = 0;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the number to be verified:");
	      x = sc.nextInt();
	      y=x;
	      while(y>0) {
	    	  z=y%10;
	    	  sum=sum+(z*z*z);
	          y=y/10;
	      }
	      	      if(x == sum)
	         System.out.println("Given number is an armstrong number.");
	      else
	         System.out.println("Given number is not an armstrong number.");
		
	}
	

}
