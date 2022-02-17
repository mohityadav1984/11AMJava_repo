package day7SingleLoop;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number for Factorial:");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int fact =1;
		while(a>1)
		{
			fact = fact *a;
			a--;
		}
		System.out.println(fact);
		s.close();
	}
}