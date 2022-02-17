package day7SingleLoop;

import java.util.Scanner;

public class PrintTable 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number for table:");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int mul;
		for( int i=1; i<=10; i++)
		{
			mul = a*i;
			System.out.println(a+" * "+i+" = "+mul);
		}
		s.close();
	}
}