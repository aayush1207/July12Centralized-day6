//Swapping of 2 numbers without using 3rd variable

package Assignment2;

import java.util.Scanner;

public class swapping {
	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of x");
		x=sc.nextInt();
		System.out.println("Enter value of y");
		y=sc.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Swapped Value of x is" +x);
		System.out.println("Swapped value of y is" +y);
		
	}

}
