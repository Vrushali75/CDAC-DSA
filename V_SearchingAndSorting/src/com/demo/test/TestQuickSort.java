package com.demo.test;

import com.demo.sorting.QuickSortService;

public class TestQuickSort {

	public static void main(String[] args) {
		int[] arr=new int[9];
		QuickSortService.acceptData(arr);
		QuickSortService.displayData(arr);
		QuickSortService.quickSort(arr,0,arr.length-1);
	}

}
