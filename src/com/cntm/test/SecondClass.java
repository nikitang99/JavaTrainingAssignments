package com.cntm.test;

public class SecondClass 
{
	 protected static int paramTwo = 20;
	 private static int paramThree = 20;
	 public static int paramFour = 20;
	 private int paraMeter1 = 30;
	 public int paraMeter2 = 40;
	 protected int paraMeter3 = 50;
	 
	 public void checkPublicInsecond() 
	{
		 DemoClass dc = new DemoClass();//in same package accessible
		 dc.printVar();
		 /**
		  * protected method of one class is accessible in another class in same package.
		  */
		 dc.checkInProtectFirst();
		System.out.println(paraMeter1);
		System.out.println(paraMeter2);
		System.out.println(paraMeter3);
		System.out.println(paramTwo);
	}
	 protected void checkProtectInsecond() 
	{
			System.out.println(paraMeter1);
			System.out.println(paraMeter2);
			System.out.println(paraMeter3);
			System.out.println(paramTwo);
	}
	 @SuppressWarnings("unused")
	private void checkPrivateInsecond() //it will be unused as it is private
	{
			System.out.println(paraMeter1);
			System.out.println(paraMeter2);
			System.out.println(paraMeter3);
			System.out.println(paramTwo);
	}
}
