package org.cntm.cakes;

import java.util.Scanner;
class CakeCollection
{	
	public static Cake getCakeOnChoice( int choice )
	{		
		switch( choice )
		{
		case 1:	return new BdayCake();		
		case 2:	return new WeddingCake();
		case 3: return new ChritsmasCake();
		}
		return null;
	}
}
class FlavourChoices	//Factory Method for Flavours
{	
	public static IFlavours getChoice( int choice )
	{		
		switch( choice )
		{
		case 1:	return new chocolateFlavour();		
		case 2:	return new BlackForestFlavour();
	
		}
		return null;
	}
}

class ProcessCake
{
	public static int menuList(){
		System.out.println("\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("0.Exit");
		System.out.println("1.Bday Cake");
		System.out.println("2.Chritsmas Cake");
		System.out.println("3.Anniversary Cake");
		
		System.out.println("Enter Choice to Order:");
		return sc.nextInt();		
	}
	
	public static int flavourMenuList(){
		System.out.println("\n");
		System.out.println("Choose Flavour: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("0.Exit");
		System.out.println("1.Chocolate");
		System.out.println("2.Black-Forest Cake");
		
		
		return sc.nextInt();		
	}
	
	/**
	 * code to an Interface not to an Implementation
	 * @param flvour
	 */
	private static void ChooseFlavour(IFlavours flvour)
	{
		if(flvour instanceof chocolateFlavour)
		{
			chocolateFlavour cf = new chocolateFlavour();
			cf.chooseFlavour();
		}
		else{
			BlackForestFlavour bf = new BlackForestFlavour();
			bf.chooseFlavour();
			
		}
		
	}
	
	private static void selectFlavour()
	{
		int choice = ProcessCake.flavourMenuList();
	
			IFlavours flvour  =  FlavourChoices.getChoice(choice);
			ProcessCake.ChooseFlavour(flvour);
		
	}
	/**
	 * oops Principle
	 *  code to an Interface not to an Implementation
	 *  loose Coupling
	 * @param cake
	 */
	public static void makeCake(Cake cake) {
		if(cake instanceof BdayCake)
		{
		;
			cake.whichCake();
			ProcessCake.selectFlavour();
			
			cake.bakeCake();
			cake.freezeCake();
			((BdayCake) cake).candleOnCake();
			
			
		}
		else
			if(cake instanceof WeddingCake)
			{
				
				cake.whichCake();
				ProcessCake.selectFlavour();
				cake.bakeCake();
				cake.freezeCake();
				((WeddingCake) cake).makingLayerOnCake();
			}
			else if(cake instanceof ChritsmasCake)
			{

				cake.whichCake();
				ProcessCake.selectFlavour();
				cake.bakeCake();
				cake.freezeCake();
				((ChritsmasCake) cake).printMessageOnCake();
			}
		
	}
}
public class OrderCake {
	
	public static void main(String[] args) 
	{
		int choice;
		while( ( choice = ProcessCake.menuList( ) )  != 0 )
		{
			Cake cake  =  CakeCollection.getCakeOnChoice(choice);
			ProcessCake.makeCake(cake);
		}

	}


}
