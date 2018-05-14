package com.cntm.constructors;

public class Person
{
	String name;
	int age;
	static int count;
/*	private Person() 
	{
		this.name = "abc";
		this.age = 22;
	}*/
/*	public Person() 
	{
		
		this.name = "abc";
		this.age = 22;
		System.out.println("In person class constructor");
	}*/
	public Person(String name, int age) {
		super();
		Person.count = 0;
		this.name = name;
		this.age = age;
	}

	
}
