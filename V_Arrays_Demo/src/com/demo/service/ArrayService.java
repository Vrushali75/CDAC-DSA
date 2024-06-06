package com.demo.service;

import java.util.Scanner;

public class ArrayService {

	int i;
	public static void acceptArray(int[] arr) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 5 array elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}

	public static void displayArray(int[] arr) {

		System.out.println("Array elements are: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+"--->"+arr[i]);
		}
	}

	public static int displayMaxArray(int[] arr) {

		int max=arr[0],pos=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				pos=i;
			}
		}
		return max;
		
	}

	public static int displayEvenMaxArray(int[] arr) {
		int i,max=-1;
		//this for loop is for finding first even number to store in max variable
		for(i=0;i<arr.length;i++)
		{       
			if(arr[i]%2==0)
			{
				max=arr[i];
				break;
			}
		}
		
		//this for loop is for finding the maximum even number in the array
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]%2==0 && arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	
	private static int findSum(int num)
	{
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=(int)num/10;
		}
		return sum;
	}

	public static int sumOfDigits(int[] arr ) {
		int i,sum=0;
		for(i=0;i<arr.length;i++)
		{
			int sum1=sum+findSum(arr[i]);
			System.out.println("Sum of digit is: "+sum1);
			sum=sum+sum1;
		}
		System.out.println("Total sum of newly generated sum of individual digit is: "+sum);
		return sum;
	}
	
	
	
}
