package com.cntm.polymorphism;

import java.io.IOException;

public class ParentClass
{
	void add(int a,int b)
	{
		System.out.println("parent Class");
	}
	
	ChildClass sampleMethod()
	{
		System.out.println("Parent class method having return type childClass");
		return null;
	}
	ParentClass demoMethod()
	{
		return null;
	}
	protected void checkAccess() {
		System.out.println("to check Access in subclass for overriding");
	}
	public void checkExeptions() throws IOException
	{
		System.out.println("Throws checked Exception");
	}
	public void checkRuntymException() {
		System.out.println("does not throw Exception");
	}
	final public void checkFinalMethod() {
		System.out.println("Parent class Final method");
	}
	private void checkInheritance() {
		System.out.println("Private method of parent Class");
	}
}
