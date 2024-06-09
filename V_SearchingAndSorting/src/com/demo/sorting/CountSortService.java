package com.demo.sorting;

import java.util.Scanner;

public class CountSortService {

	public static void acceptData(int[] arr) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  random 8 array elemnts: ");
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
		System.out.println("-----------------------------");
		
	}

	public static int[] countSort(int[] arr) {
		
		//find maximum number in the array
		int max=findMax(arr);
		
		//allocate new array with +1 size 
		int[] count=new int[max+1];
		
		//initialize the entire count array with 0
		for(int i=0;i<count.length;i++)
		{
			count[i]=0;
		}
		
		//count the occurances of the elements in the actual array
		for(int i=0;i<arr.length;i++)
		{
			count[arr[i]]++;
		}
		
		//find cummulative sum
		for(int i=1;i<count.length;i++)
		{
			count[i]=count[i-1]+count[i];
		}
		
		
		//create new output array with actual array length, 
		//to place them at the respective position
		int[] output=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int pos=count[arr[i]-1];
			output[pos]=arr[i];
			count[arr[i]]--;
		}
		return output;
	}

	private static int findMax(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}

}
