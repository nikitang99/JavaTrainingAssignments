package org.centm.sort;

public class BubbleSort implements Isort {

	@Override
	public int[] sort(int[] arr) {
		int i, j, temp;
		for (i = 0; i < arr.length - 1; i++) 
		{

			for (j = 0; j < arr.length - i - 1; j++) 
			{
				if (arr[j] > arr[j + 1]) 
				{
					// swap arr[j] and arr[j+1]
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Bubble Sort");
		return arr;
	}

}
