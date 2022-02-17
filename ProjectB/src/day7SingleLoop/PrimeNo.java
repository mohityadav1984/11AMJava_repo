package day7SingleLoop;

import java.util.Scanner;

public class PrimeNo 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number:");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int half = a/2, prime=0;
		for(int i=2; i<=half; i++)
		{
			if (a%i==0)
			{
				System.out.println("Number "+a+" is not prime");
				prime=1;
				break;
			}			
		}
		if (prime==0)
		{
			System.out.println("Number "+a+" is prime");
		}
		s.close();
	}
}