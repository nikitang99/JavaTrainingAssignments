package org.centm.sort;

import java.util.Scanner;

public class DriverSort {
	public static void main(String[] args)
	{
		int choice;
		int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
		while( ( choice = ProcessSort.menuList( ) )  != 0 )
		{
			Isort srtObj  =  SortFactory.getSortOnChoice(choice);
			ProcessSort.sortArray(srtObj, arr);
		}
	}

}
