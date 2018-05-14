package org.centm.sort;

public class QuickSort implements ISort {

	private int partition(int arr[], int low, int high)
	{
		int pivot = arr[high]; 
		int i = (low-1);
		for (int j=low; j<high; j++)
		{
			if (arr[j] <= pivot)
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;

		return i+1;
	}
	private void quickSort(int arr[], int low, int high)
	{
		if (low < high)
		{
			int pi = partition(arr, low, high);

			//recursive call
			quickSort(arr, low, pi-1);//left subarray
			quickSort(arr, pi+1, high);//right subarray
		}
	}
	
	@Override
	public int[] sort(int[] arr) {
		int low = 0;
		int high = arr.length-1;
		quickSort(arr, low, high);
		System.out.println("Quick Sort");
		return arr;

	}

}
