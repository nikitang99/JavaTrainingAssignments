package org.centm.sort;

public class SelectionSort implements Isort {

	@Override
	public int[] sort(int[] arr) {
		int i,j,temp;
		for(i=0;i<arr.length-1 ;i++)
		{
			for(j=i+1; j<arr.length-1;j++)
			if(arr[i] > arr[j] )
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j]=temp;
			}
		}
		return arr;
		

	}

}
