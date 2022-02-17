package day7SingleLoop;

import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number for Fibonacci:");
		Scanner s = new Scanner(System.in);
		int fib = s.nextInt();
		int a = 0, b = 1, c = 0;
		System.out.print(a);
		System.out.print(" ");
		System.out.print(b);		
		for(int i=2; i<fib; i++)
		{
			c = a + b;
			a = b;
			b =c;
			System.out.print(" ");
			System.out.print(c);
		}
		s.close();
	}
}