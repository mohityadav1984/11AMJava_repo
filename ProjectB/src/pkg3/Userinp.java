package pkg3;

import java.util.Scanner;

import pkg1.Arithmatic;

public class Userinp 
{
	public void div(int a, int b)
	{
		int c;
		c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the value of X1");
		int x1 = s.nextInt();
		System.out.println("Please enter the value of X2");		
		int x2 = s.nextInt();
		System.out.println("Please enter the value of X3");
		int x3 = s.nextInt();
		System.out.println("Please enter the value of X4");
		int x4 = s.nextInt();
		System.out.println("Please enter the value of X5");
		int x5 = s.nextInt();
		System.out.println("Please enter the value of X6");
		int x6 = s.nextInt();
		Arithmatic a = new Arithmatic();
		int sumresult = a.sum(x1, x2);
		int subresult = a.sub(sumresult, x3);
		subresult = a.sub(subresult, x4);
		int multiresult = a.multi(subresult, x5);
		Userinp b = new Userinp();
		System.out.println("Expression (((((x1+x2)-x3)-x4)*x5)/x6) result is: ");
		b.div(multiresult, x6);
	}
}
