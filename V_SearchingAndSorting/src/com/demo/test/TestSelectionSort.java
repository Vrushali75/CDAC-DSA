package com.demo.test;

import com.demo.sorting.SelectionSortService;

public class TestSelectionSort {

	public static void main(String[] args) {
		int[] arr=new int[9];
		SelectionSortService.acceptData(arr);
		SelectionSortService.displayData(arr);
		SelectionSortService.sortAscending(arr);
		SelectionSortService.displayData(arr);
	}

}
