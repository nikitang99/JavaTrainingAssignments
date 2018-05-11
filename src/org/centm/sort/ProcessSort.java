package org.centm.sort;

import java.util.Scanner;



public class ProcessSort
{
	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}
	}
	public static int menuList()
	{
		System.out.println("\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("0.Exit");
		System.out.println("1.Bubble Sort");
		System.out.println("2.Selection Sort");
		System.out.println("3.Quick Sort");
		System.out.println("4.Merge Sort");
		
		System.out.println("Enter Choice to for Sorting Algorithm:");
		return sc.nextInt();		
	}
	public static void sortArray(Isort sObj,int[] arr) 
	{
		int[] srtedArr = sObj.sort(arr);
		printArray(srtedArr);

	}

}
