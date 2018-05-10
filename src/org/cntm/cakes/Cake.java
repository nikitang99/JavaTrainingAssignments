package org.cntm.cakes;

public abstract class Cake		//open for Extension
{
	 public void bakeCake()
	{
		 System.out.println("Cake is Baking");	
	}
	 public void freezeCake()
	{
		System.out.println("Cake is in Freezer");
	}
	 public  abstract void whichCake();
	
}
