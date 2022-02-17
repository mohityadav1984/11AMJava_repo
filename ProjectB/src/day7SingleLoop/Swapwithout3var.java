package day7SingleLoop;

import java.util.Scanner;

public class Swapwithout3var 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter first number:");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("First number before swap:"+a);
		System.out.println("Enter first number:");
		int b = s.nextInt();
		System.out.println("Second number before swap:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("First number after swap:"+a);
		System.out.println("Second number after swap:"+b);
		s.close();
	}
}