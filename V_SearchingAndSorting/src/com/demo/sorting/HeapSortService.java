package com.demo.sorting;

import java.util.Scanner;

public class HeapSortService {

	public static void acceptdata(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("enetr data");
			arr[i]=sc.nextInt();
		}
		
	}
	
	public static void displaydata(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"---->"+arr[i]);
			
		}
		
	}
	
	public static void heapSort(int [] arr) {
		int n=arr.length;
		
		//build a maxheap
		for(int i=n/2-1;i>=0;i--) {
			heapify(arr,n,i);
		}
		
		//swap the first element with the last element of unsorted part
		for(int i=n-1;i>=0;i--) {
		int temp=arr[0];
		arr[0]=arr[i];
		arr[i]=temp;
		
		heapify(arr,i,0);
		}
		
	}

	private static void heapify(int[] arr, int n, int i) {
		//find the largest among root, left child, right child
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		if(left<n && arr[left]>arr[largest])
			largest=left;
		if(right<n && arr[right]>arr[largest])
			largest=right;
		if(largest!=i) {
			int temp=arr[largest];
			arr[largest]=arr[i];
			arr[i]=temp;
			heapify(arr,n,largest);
		}
		
	}

}






