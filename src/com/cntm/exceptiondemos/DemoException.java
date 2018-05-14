package com.cntm.exceptiondemos;

import java.io.IOException;
import java.util.Scanner;

public class DemoException 
{
	public static int divisionMethod() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers for Division:");
		int a = sc.nextInt();
		int b =  sc.nextInt();
		
		try {
			int result = a/b;
			/*before return statement it will jump to finally  */
		//	System.exit(0);//--> it will not execute finally block
			return result;
		}
		catch(RuntimeException exception)
		{
			System.out.println("In RuntimeException catch block");
			return 0;
		}
		catch (Exception e) {
			/*if exception occurs but just before returning it will
			 *  jump to finally block*/
			//System.exit(0);//--->will not execute finally block
			return 1;
		}
		finally {
		//	return 2;//-->it will always execute
			System.out.println("In finally");
		}
	}
	public static void main(String[] args) 
	{
		int result = divisionMethod();
		System.out.println(result);
	}

}
