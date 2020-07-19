package Assignment6;

import java.util.Scanner;

public class table {
	public static void main(String[] args)
	{
		int value;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number for the table");
		value=sc.nextInt();
//		int value=11;
		for(int i=1;i<=10;i++)
		{
			System.out.printf("%d * %d = %d \n", value, i, value * i);
		}
	}

}
