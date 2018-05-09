package com.cntm.testtwo;
import com.cntm.test.FirstClass;
//import com.cntm.test.;--->Only Type is Imported
import com.cntm.test.SecondClass;

public class ForthClass extends ThirdClass
{
	void checkDataInforth()
	{
		
		System.out.println(paraMeter2); //public members of parent class in different package accessible
		System.out.println(paraMeter3); //protected members of parent class in different package accessible
		//System.out.println(paraMeter1); //private members of parent class in different package not accessible
		
		System.out.println(b); //protected members of parent class in different package accessible
		System.out.println(c); //protected members of parent class in different package accessible
		System.out.println();

		//System.out.println(a); //private member of parent class in same package is not accessible
	}
	
	protected void checkProtectInForth()
	{
		/**
		 * protected are accessible in subclasses
		 */
		checkProtectInsecond();
		checkProtectInThird();
		
	}
	public void checkPublicInForth()
	{
			
	}
	@SuppressWarnings("unused")
	private void checkPrivateInForth()
	{
		
	}
	/*int add(){
		cannot OVERRIDE final method in subclass
	}*/
}
class TestForth
{
ForthClass fc = new ForthClass();
ThirdClass tc = new ThirdClass();
SecondClass sc = new SecondClass();


/**
 * default access-> can't access in another package
 */
//DemoClass dc = new Democlass();
/**
 * protected Method of parent class is accessible in another class in same package through object of
 *  that class and subclass
 */
 public void checkAccess()
{
	fc.checkProtectInThird(); 
	fc.checkProtectInForth();
	
	tc.checkProtectInThird();
	/**
	 *only public method is accessible of another class in another package which is not extended
	 */
	sc.checkPublicInsecond();
	System.out.println(FirstClass.firstVar);//public static variables are accessible 
}
}
