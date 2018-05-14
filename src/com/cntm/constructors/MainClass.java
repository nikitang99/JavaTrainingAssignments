package com.cntm.constructors;

public class MainClass {

	public static void main(String[] args) 
	{
		/**Person person = new Person();
		 * it will not call default no-arg constructor as argument constructor 
		 * is provided*/
		Person person = new Person("nikita", 22);
		StudentClass sc = new StudentClass();
	}

}
