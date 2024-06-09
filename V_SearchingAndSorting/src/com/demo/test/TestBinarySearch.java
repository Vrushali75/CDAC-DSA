package com.demo.test;

import java.util.Scanner;

import com.demo.searching.BinarySearchService;

public class TestBinarySearch {

	public static void main(String[] args) {
		int[] arr=new int[5];
		int choice;
		Scanner sc=new Scanner(System.in);
		BinarySearchService.acceptData(arr);
		BinarySearchService.displayData(arr);
		do
		{
			System.out.println("1)Binary Search \n2)Sequential Search \n3)EXIT");
			choice=sc.nextInt();
			System.out.println("Enter the number to be search: ");
			int num=sc.nextInt();
			switch(choice)
			{
				//Case for Binary Search
				case 1:
					int pos=BinarySearchService.binarySearch(arr,0,arr.length,num);
				if(pos!=-1)
					System.out.println(num+" found at "+pos+" position");
				else
					System.out.println("Number not found!");
					break;
					
				//Case for sequential search
				case 2:
					int pos1=BinarySearchService.sequentialSearch(arr,num);
					if(pos1!=-1)
						System.out.println(num+" found at "+pos1+" position");
					else
						System.out.println("Number not found!");
					break;
				
				case 3:
					System.out.println("Thank You");
					sc.close();
					break;
					
				default:
					System.out.println("Invalid choice!");
					break;
			}
		}while(choice!=3);
		
	}
}
