package org.centm.sort;

public class MergeSort implements ISort {

	@Override
	public int[]  sort(int[] arr) {
		MrgeSort(arr, 0, arr.length-1);
		System.out.println("Merge Sort");
		return arr;
	}

	private void MrgeSort(int arr[], int left, int right)
	{
		if (left < right)
		{
			
			int mid = (left+right)/2;
			
			MrgeSort(arr, left, mid);
			MrgeSort(arr , mid+1, right);

			merge(arr, left, mid, right);
		}
	}

	private void merge(int[] arr, int left, int mid, int right) 
	{
		// Find sizes of two subarrays to be merged
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int leftArray[] = new int [n1];
		int rightArray[] = new int [n2];


		for (int i=0; i<n1; ++i)
			leftArray[i] = arr[left + i];
		for (int j=0; j<n2; ++j)
			rightArray[j] = arr[mid + 1+ j];


		int i = 0, j = 0;

//To put sorted Elements in array
		int k = left;
		while (i < n1 && j < n2)
		{
			if (leftArray[i] <= rightArray[j])
			{
				arr[k] = leftArray[i];
				i++;
			}
			else
			{
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		//Remaining elements in one of the array
		while (i < n1)
		{
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		while (j < n2)
		{
			arr[k] = rightArray[j];
			j++;
			k++;
		}
		
	}
}
