//Swapping of 2 numbers using 3rd variable

package Assignment1;

import java.util.Scanner;

public class swapping {
	public void swap()
	{   int a,b,c;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Value of a ");
		a=sc.nextInt();
		System.out.println("Enter value of b");
		b=sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("Swapped Value of a is "+a);
		System.out.println("Swapped Value of b is "+b);
		
	}
	public static void main(String[] args) {
		swapping swap = new swapping();
		swap.swap();
	}

	

}
