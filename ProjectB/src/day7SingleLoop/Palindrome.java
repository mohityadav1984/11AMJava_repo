package day7SingleLoop;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number:");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b =0, temp = a;
		while(temp>0)
		{
			b = (b*10) + (temp%10);
			temp = temp/10; 
		}
		if(a==b)
		{
			System.out.println("Number "+a+" is Palindrome");
		}
		else
		{
			System.out.println("Number "+a+ " is not Palidrome");
		}
		s.close();
	}
}