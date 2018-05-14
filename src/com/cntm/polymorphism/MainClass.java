package com.cntm.polymorphism;

public class MainClass
{

	public static void main(String[] args)
	{
		ParentClass parentObj = new ChildClass();
		parentObj.add(1, 1);//overrided method in child class

		ParentClass pObj = new ParentClass();
		pObj.add(1, 1);//parent add method
		
		ChildClass childObj = new ChildClass();
		//it will not override in child class as number of arguments are different
		//if not overrided in child class.
		childObj.add(10,11);//parent class's add method will call
		childObj.add(1, 2);//overrided method in child class will call
	
	}

}
