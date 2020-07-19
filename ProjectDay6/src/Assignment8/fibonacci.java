package Assignment8;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args)
	{
		int t1 = 0, t2 = 1;
		int value;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a length of Fibonacci Series");
		value=sc.nextInt();
        System.out.print("First " + value + " of Fibonacci Series: ");

        for (int i = 1; i <= value; ++i)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
		
	}
	}
}
