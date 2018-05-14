package com.cntm.exceptiondemos;

import java.util.Scanner;

public class DemoException2 
{
	public static int divisionMethod() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers for Division:");
		int a = sc.nextInt();
		int b =  sc.nextInt();
		
		try
		{
			int result = a/b;
			try
			{
				
				System.out.println("Inner Try Block");
				System.out.println("enter changed denominator");
				b = sc.nextInt();
				result = a/b;
			} 
			catch (NullPointerException e)
			{
				//if exception is not that type it will execute outer catch block
				//inner catch block will execute only for inner try 
				System.out.println("Inner catch block");
			}
			return result;
		}
		catch (Exception e)
		{
			return 0;
		}
		finally 
		{
			System.out.println("In finally");
		}
	}
	public static void main(String[] args) 
	{
		int result = divisionMethod();
		System.out.println(result);
	}

}
