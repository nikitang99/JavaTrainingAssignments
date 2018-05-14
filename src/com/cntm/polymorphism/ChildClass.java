package com.cntm.polymorphism;

import java.io.IOException;

public class ChildClass extends ParentClass 
{
	void add(int a, int b,  int c)
	{
		System.out.println("No of parameters are different");
	}
	@Override
	void add(int a, int b) {
		System.out.println("overrided method in child");
	}

	/*ParentClass sampleMethod() 
	 //compile time error overriding method should have return type as same or subtype as that of parent class
	 
	 * {

		return super.sampleMethod();
	}*/
	@Override
	ChildClass sampleMethod() {
		return null;
	}
	
	@Override
	ChildClass demoMethod()
	{
		return (ChildClass) super.demoMethod();	
	}
/**	@Override
	ChildClass demoMethod()
	{
	
		return super.demoMethod();	
		if return type is subtype then have to typecast it
		otherwise it is compile time error.		
	}*/
	
	/**
	 * Cannot reduce the visibility of the inherited method from ParentClass
		@Override
		private void checkAccess() 
		{
			super.checkAccess();
		}
	 */
	@Override
	public void checkAccess() //same or less restrictive modifier should be there
	{
		super.checkAccess();
	}
	/**
	 * overriding method must throw Checked exception 
	 * if parent class method throws checked exception
	 * @Override
		public void checkExeptions()
		{
			super.checkExeptions();
		}
	 */
	/**
	 * must NOT throw checked exceptions that are new or broader 
	 * than those declared by  the overridden method.
	 * 
	 *Compile Time Error:Exception Exception is not compatible with throws clause in 
	 *ParentClass.checkExeptions()
	 *@Override
	public void checkExeptions() throws Exception
	{
		super.checkExeptions();
	}
	 */
	@Override
	public void checkExeptions() throws IOException {
		super.checkExeptions();
	}
	
	
	/**
	 * overriding method can throw  unchecked (runtime) exception regardless of
	 *  whether the overridden method declares the exception.
	 *  @Override
	 *  public void checkRuntymException() throws IOException
	 *	{
	 *		super.checkRuntymException();
	 *	}
	 *IOException is Checked Exception-->it will show Compile time error
		
	 */
	@Override
	public void checkRuntymException() throws ArrayIndexOutOfBoundsException
	{
		super.checkRuntymException();
	}
	/**
	 * we cannot override final method. It will give Compile time error
	 *  public void checkFinalMethod() 
	 *	 {
	 *			System.out.println("child class Final method");
	 *	 }
	 */
	
	/**
	 * it is not treated as Overriding method
	 * protected void checkInheritance()
	 *  {
	 *		System.out.println("Private method of Child Class");
	 *	}
	 */

	
	
}

