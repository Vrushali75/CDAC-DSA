package com.demo.test;

import com.demo.sorting.HeapSortService;

public class TestHeapSort {

	public static void main(String[] args) {
		int[] arr=new int[10];
		HeapSortService.acceptdata(arr);
		HeapSortService.displaydata(arr);
		HeapSortService.heapSort(arr);
		HeapSortService.displaydata(arr);

	}

}
