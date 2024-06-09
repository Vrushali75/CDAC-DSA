package com.demo.sorting;

import java.util.Scanner;

public class SelectionSortService {

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

	public static void sortAscending(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			int min_index=findMinimum(arr,i,arr.length);
			int temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
		}
		
	}

	private static int findMinimum(int[] arr, int start, int end) {
		int min=arr[start];
		int pos=start;
		for(int i=start;i<end;i++)
		{
			if(arr[i]>min)
			{
				min=arr[i];
				pos=i;
			}
		}
		return pos;
	}

}
