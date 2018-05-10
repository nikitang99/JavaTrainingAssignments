package org.cntm.cakes;

public class WeddingCake extends Cake
{
	public void makingLayerOnCake()
	{
		System.out.println("making Layer of cake");
	}

	@Override
	public void whichCake() {
		System.out.println("You selected anniversary Cake");		
	}
}
