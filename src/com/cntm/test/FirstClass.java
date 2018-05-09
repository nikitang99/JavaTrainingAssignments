package com.cntm.test;

import com.cntm.testtwo.ThirdClass;

class DemoClass{
	private int paramOne;
	public int paramTwo = 30;
	protected int paramThee = 40;
	
	public DemoClass() {
		paramOne = 10;
	}
	public void setParamOne(int paramOne) {
		this.paramOne = paramOne;
	}
	public int getParamOne() {
		return paramOne;
	}
	public void printVar()
	{
		System.out.println("The Value of Var is: " +paramOne);
	}
/*	private void printVar()
	{
		System.out.println("The Value of Var is: " +paramOne);
		//if method is Private then it will not visible to other class by object
	}*/
	protected void checkInProtectFirst() {
		
	}
	
}
public class FirstClass {

	public static int firstVar = 100;
	public static void main(String[] args) {
		DemoClass dc = new DemoClass();
		dc.printVar();
		//SecondClass sc = new SecondClass();
		System.out.println(dc.paramThee);//protected members are accessible directly
		System.out.println(dc.paramTwo);//public members are accessible directly
	//	System.out.println(dc.paramOne);//private members not accessible directly(through getter and setter)
		System.out.println(SecondClass.paramTwo);
		ThirdClass tc = new ThirdClass();
		tc.checkDataMembers();

	}
	/*When a class or an interface is declared with strictfp modifier, then all methods declared in
	 *  the class/interface, and all nested types declared in the class, are implicitly strictfp.
	strictfp cannot be used with abstract methods. However, it can be used with abstract classes/interfaces.*/
}
