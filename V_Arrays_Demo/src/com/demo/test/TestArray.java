package com.demo.test;
import com.demo.service.ArrayService;
public class TestArray {
	
	public static void main(String[] args)
	{
		int[] arr=new int[5];
		ArrayService.acceptArray(arr);
		ArrayService.displayArray(arr);
		int num=ArrayService.displayMaxArray(arr);
		System.out.println("Maximum number in the array is: "+num);
		int even_num=ArrayService.displayEvenMaxArray(arr);
		if(even_num!=-1)
			System.out.println("Maximum even number in the array is: "+even_num);
		else
			System.out.println("No even num present!");
		ArrayService.sumOfDigits(arr);
		
	}

	
}
