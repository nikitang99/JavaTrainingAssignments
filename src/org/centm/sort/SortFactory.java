package org.centm.sort;

public class SortFactory
{
	public static Isort getSortOnChoice( int choice )
	{		
		switch( choice )
		{
		case 1:	return new BubbleSort();		
		case 2:	return new SelectionSort();
		case 3: return new QuickSort();
		case 4: return new MergeSort();
		}
		return null;
	}
}
