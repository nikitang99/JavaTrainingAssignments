package com.cntm.loops;

public class LoopCheck {

	public static void main(String[] args) 
	{
		int index = 0;
		for(index=0; index<5; index++)
		{
			if(index == 3 )
			{
				break;
			}
			continue;
		}
		System.out.println("Index: "+index);//will print 3
		index=0;
		while (index <= 4) {
			if(index == 2)
			{
				break;
			}
			index++;	
		}
		System.out.println("Index: "+index);
	}

}
