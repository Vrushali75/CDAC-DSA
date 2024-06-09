package com.demo.sorting;

import java.util.Scanner;

public class BubbleSortService {

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

	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[j-1]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
			System.out.println("Iteration no: "+i);
			displayData(arr);
		}
		
	}

	public static void improvedBubbleSort(int[] arr) {
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			flag=false;
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[j-1]>arr[j])
				{
					flag=true;
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
			if(!flag)
			{
				System.out.println("In flag Flase");
				break;
			}
			System.out.println("Iteration no: "+i);
			displayData(arr);
		}
	}

	public static void bubbleSortDataDesc(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				//for descending order of sorted elements
				if(arr[j-1]<arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					
				}
			}
			System.out.println("Iteration no: "+i);
			displayData(arr);
		}
		
	}

	
}
