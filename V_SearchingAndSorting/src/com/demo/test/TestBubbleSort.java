package com.demo.test;

import com.demo.sorting.BubbleSortService;

public class TestBubbleSort {

	public static void main(String[] args) {
		int[] arr=new int[10];
		BubbleSortService.acceptData(arr);
		BubbleSortService.displayData(arr);
		//BubbleSortService.bubbleSort(arr);
		BubbleSortService.improvedBubbleSort(arr);
		//BubbleSortService.bubbleSortDataDesc(arr);
		

	}

}
