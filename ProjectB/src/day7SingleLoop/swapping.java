package day7SingleLoop;

import java.util.Scanner;

public class swapping 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter first number:");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("First number before swap:"+a);
		System.out.println("Enter first number:");
		//Scanner s = new Scanner(System.in);
		int b = s.nextInt();
		System.out.println("Second number before swap:"+b);
		int c = 0;
		c=a;
		a=b;
		b=c;
		System.out.println("First number after swap:"+a);
		System.out.println("Second number after swap:"+b);
		s.close();
	}
}