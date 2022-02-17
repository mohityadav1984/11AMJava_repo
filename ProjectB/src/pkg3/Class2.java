package pkg3;

import pkg1.Arithmatic;

public class Class2 
{
	public static void main(String[] args) 
	{
		Arithmatic a = new Arithmatic();
		a.multi(2, 3);	
		a.sum(4, 5);
		System.out.println("Total argument:"+args.length);
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}
}
