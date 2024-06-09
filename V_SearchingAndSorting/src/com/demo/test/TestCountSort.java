package com.demo.test;

import com.demo.sorting.CountSortService;

public class TestCountSort {

	public static void main(String[] args) {
		
		int[] arr=new int[8];
		CountSortService.acceptData(arr);
		CountSortService.displayData(arr);
		int[] output=CountSortService.countSort(arr);
		CountSortService.displayData(output);
		
	}

}
