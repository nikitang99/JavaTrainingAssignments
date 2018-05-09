package com.cntm.testtwo;

import com.cntm.test.SecondClass;

public class ThirdClass extends SecondClass
{
	private int a = 50;
	protected int b = 100;
	public int c = 200;
	int d = 150;
	
	final int add(){
		return a+b;
	}
	SecondClass sc = new SecondClass();
	public void checkDataMembers()
	{
		System.out.println(paramTwo);//protected static variables are also inherited in subclass
		
		System.out.println(paraMeter2); //public members of parent class in different package directly accessible
		System.out.println(paraMeter3); //protected members of parent class in different package directly accessible
		//System.out.println(paraMeter1); //private members of parent class in different package not accessible
		System.out.println(sc.paraMeter2); //public members of parent class in different package directly accessible
	
		/*System.out.println(sc.paraMeter3);*/ 
			//protected members of parent class are not accessible through object of parent class
		     //because members are inherited in subclass.
		
		/*System.out.println(sc.paraMeter1);*/
		//private members of parent class are not accessible through object of parent class

	}
	protected void checkProtectInThird()
	{
		sc.checkPublicInsecond();
		//sc.checkProtectedInsecond();//cant access through object
		checkProtectInsecond();//we can access directy because it is inherited
	}
	public void checkPublicInThird()
	{
			
	}
	@SuppressWarnings("unused")
	private void checkPrivateInThird()
	{
		
	}
	
}
class TestThird
{
	public void checkInTestThird()
	{
		ThirdClass tc = new ThirdClass();
		/**
		 * protect method of secondClass not accessible in third class it will become private
		 */
		//tc.checkProtectInsecond();
			tc.checkProtectInThird();
		SecondClass scndObj = new SecondClass();
		scndObj.checkPublicInsecond();//public method accessible
		/**
		 * protected method not accessible in another class of another package
		 */
		//scndObj.checkProtectInsecond();
		System.out.println(SecondClass.paramFour);//only public static accessible in another class in another package
	}

		

	
	
}