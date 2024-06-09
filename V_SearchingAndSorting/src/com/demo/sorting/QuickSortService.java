package com.demo.sorting;

import java.util.Scanner;

public class QuickSortService {

	public static void acceptData(int[] arr) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  random 10 array elemnts: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}

	public static void displayData(int[] arr) {
		System.out.println("Array elements are: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(" "+arr[i]);
		}
	}

	public static void quickSort(int[] arr, int start, int end) {
		if(start<end)
		{
			//Partition will place the pivot at proper position
			int p=partition(arr,start,end);
			quickSort(arr,start,p+1);
			quickSort(arr,p-1,end);	
		}
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot=start;
		int i=start;
		int j=end;
		
		while(i>j)
		{
			// 
			while(end<i && arr[i]<=arr[pivot])
				i++;
			// 
			while(j>pivot && arr[j]>arr[pivot])
				j--;
			
			//swapping i and j
			if(i<j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		//swapping pivot and j when i and j crosses
		int temp=arr[j];
		arr[j]=arr[pivot];
		arr[pivot]=temp;
		
		System.out.println("Pivot "+arr[j]+" is placed at "+j+" position");
		displayData(arr);
		return j;

	}
	
	
}
