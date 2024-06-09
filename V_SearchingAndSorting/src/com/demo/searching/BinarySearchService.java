package com.demo.searching;
import java.util.Scanner;
public class BinarySearchService {

	public static void acceptData(int[] arr) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 array elemnts in sorted order: ");
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

	//Function for Binary Search
	public static int binarySearch(int[] arr, int low, int high, int num) {
		
		if(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==num)
				return mid;
			else
			{
				if(arr[mid]<num)
				{
					//returns the right side of the array
					return binarySearch(arr,mid+1,high,num);
				}
				else
				{
					//returns the left side of an array 
					return binarySearch(arr,low,mid-1,num);
				}
			}
		}
		else
			return -1;
	}

	//Function for sequential search
	public static int sequentialSearch(int[] arr, int num) {
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
				return i;
		}
		return -1;
	}
	
	
}
