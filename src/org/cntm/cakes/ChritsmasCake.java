package org.cntm.cakes;

public class ChritsmasCake extends Cake
{
	public void printMessageOnCake()
	{
		System.out.println("Merry Chritsmas");
	}

	@Override
	public void whichCake() {
		System.out.println("You Selected ChritsmasCake");
		
	}
}
