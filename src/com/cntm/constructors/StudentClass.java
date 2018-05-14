package com.cntm.constructors;

public class StudentClass extends Person
{
	int rollNo;
	float marks;
	/**
	 *Compiletime error: Implicit super constructor Person() is not visible. Must explicitly invoke 
	 * another constructor
	 * if constructor is Private
	 * 	public StudentClass()
	{
		super();
		this.name = "XYZ";
		this.age = 22;
		this.rollNo = 11;
		this.marks = 88.03f;
	}
	 */
/*	public StudentClass(){
		super();	//default(no-arg) constructor of superclass is called if not provided
		this.name = "XYZ";
		this.age = 22;
		this.rollNo = 11;
		this.marks = 88.03f;
	}*/
	public StudentClass()
	{
		/*
		 * first It will invoke superclass constructor then this constructor gets call
		 */
		super("xyz", 22);//have to provide explicitely
		System.out.println("In StudentClass Constructor");
		Person.count =1;
		this.name = "XYZ";
		this.age = 22;
		this.rollNo = 11;
		this.marks = 88.03f;
	}

}
