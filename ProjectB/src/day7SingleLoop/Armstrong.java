package day7SingleLoop;

import java.util.Scanner;

public class Armstrong 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number:");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int len=0, temp = a, sum=0, lastdigit;
		//check length
		while(temp>0)
		{
			temp = temp/10;
			len++;
		}
		temp = a;
		while(temp>0)
		{
			lastdigit = temp%10;
			sum = (int) (sum + (Math.pow(lastdigit, len)));
			temp = temp/10;
		}
		if(sum==a)
		{
			System.out.println("Number "+a+" is Armstrong");
		}
		else
		{
			System.out.println("Number "+a+ " is not Armstrong");
		}
		s.close();
	}
}